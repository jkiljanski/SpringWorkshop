package workshop.spring.exercises.misc;

import org.springframework.beans.factory.InitializingBean;

public class ShoutingBean implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("!");
        System.out.println("!!!!!");
        System.out.println("!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!                              !!!");
        System.out.println("!!!! SPRING BOOT Context started! !!!");
        System.out.println("!!!!                              !!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!");
        System.out.println("!!!!!");
        System.out.println("!");

    }
}
