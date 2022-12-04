package panos;

public interface Subscribe {
    public void addSubscriber(Observer observer,String interest);
    public void removeSubscriber(Observer observer,String interest);
    public void handleSubscriber(Observer observer,String interest);
}
