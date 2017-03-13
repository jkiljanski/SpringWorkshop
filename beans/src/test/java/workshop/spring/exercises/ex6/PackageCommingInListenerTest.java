package workshop.spring.exercises.ex6;

import com.google.common.collect.Lists;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

//TODO: One listener should be sending emails on too many packages damaged
@Test
@ContextConfiguration
public class PackageCommingInListenerTest extends AbstractTestNGSpringContextTests {
    @Configuration
    @ComponentScan(basePackages = "workshop.spring.exercises.ex6")
    public static class TestConfig{

        @Bean
        MailSender mailSenderAdapter(){
            return Mockito.mock(MailSender.class);
        }

    }
    @Autowired
    private MailSender mailSenderMock;

    @Autowired
    private PackageReceiver packageReceiver;

    @Autowired
    private CounterHolder counterHolder;

    @Autowired
    private CountingPackageObservator countingPackageObservator;

    public void shouldPassAndCount7Packages(){
        packageReceiver.startReceiving();
        packageReceiver.receivedPackage(new Package(1, false));
        packageReceiver.receivedPackage(new Package(2, true));
        packageReceiver.receivedPackage(new Package(3, false));
        packageReceiver.receivedPackage(new Package(4, true));
        packageReceiver.receivedPackage(new Package(5, false));
        packageReceiver.receivedPackage(new Package(6, true));
        packageReceiver.receivedPackage(new Package(7, false));

        assertThat(counterHolder.getCurrentCounter()).isEqualTo(7);

        Mockito.verifyNoMoreInteractions(mailSenderMock);
    }

    public void shouldStopAt5thPackageDamaged(){
        packageReceiver.startReceiving();
        packageReceiver.receivedPackage(new Package(1, true));
        packageReceiver.receivedPackage(new Package(2, true));
        packageReceiver.receivedPackage(new Package(3, true));
        packageReceiver.receivedPackage(new Package(4, true));
        packageReceiver.receivedPackage(new Package(5, false));
        packageReceiver.receivedPackage(new Package(6, true));

        assertThat(counterHolder.getCurrentCounter()).isEqualTo(6);

        Mockito.verify(mailSenderMock).sendMessageAboutInvalidPackages(Lists.newArrayList(1,2,3,4,6));
    }
}
