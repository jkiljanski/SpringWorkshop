package workshop.spring.exercises.ex6_message;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

//TODO: One listener should be sending emails on too many packages damaged
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@ContextConfiguration
public class PackageCommingInListenerTest {
  @Configuration
  @ComponentScan(basePackages = "workshop.spring.exercises.ex6_message")
  public static class TestConfig {


  }


  @MockBean
  private AlertMailSender alertMailSenderMock;

  @Autowired(required = false)
  private PackageReceiver packageReceiver;

  @Autowired(required = false)
  private CountingPackageObserver countingPackageObserver;

  @Order(1)
  @Test
  public void shouldPassAndCount7Packages() {

    packageReceiver.receivedPackage(new Package(1, false));
    packageReceiver.receivedPackage(new Package(2, true));
    packageReceiver.receivedPackage(new Package(3, false));
    packageReceiver.receivedPackage(new Package(4, true));
    packageReceiver.receivedPackage(new Package(5, false));
    packageReceiver.receivedPackage(new Package(6, true));
    packageReceiver.receivedPackage(new Package(7, false));

    assertThat(countingPackageObserver.getNumberOfPackages()).isEqualTo(7);

    Mockito.verifyNoMoreInteractions(alertMailSenderMock);
  }

  @Order(2)
  @Test
  public void shouldStopAt5thPackageDamaged() {

    packageReceiver.receivedPackage(new Package(1, true));
    packageReceiver.receivedPackage(new Package(2, true));
    packageReceiver.receivedPackage(new Package(3, true));
    packageReceiver.receivedPackage(new Package(4, true));
    packageReceiver.receivedPackage(new Package(5, false));
    try {
      packageReceiver.receivedPackage(new Package(6, true));
    } catch (Exception e) {
      //assertThat(e).isExactlyInstanceOf(TooManyPackagesDamagedException.class);
    }

    assertThat(countingPackageObserver.getNumberOfPackages()).isEqualTo(5);
    Mockito.verify(alertMailSenderMock)
        .sendMessageAboutInvalidPackages(Lists.newArrayList(1, 2, 3, 4, 6));
  }
}
