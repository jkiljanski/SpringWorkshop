package workshop.spring.exercises.ex4.processing;

public class Main {

    public static void main(String[] args) {
        FullyActivatedProcessingMachine fullyActivatedProcessingMachine
                = new FullyActivatedProcessingMachine(new ActivationNeedingProcessor("!#2"));
        fullyActivatedProcessingMachine.setInjectedBySetter(new ActivationNeedingProcessor("dasd"));


    }
}
