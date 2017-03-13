package workshop.spring.exercises.ex3.processing;

public class CommonProcessor implements MessageProcessor{
    private final String name;

    public CommonProcessor(String name) {
        this.name = name;
    }

    @Override
    public void processMessage(Message message) {
        message.setProcessedBy(name);
    }
}
