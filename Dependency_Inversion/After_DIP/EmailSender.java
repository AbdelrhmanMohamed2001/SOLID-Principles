// Low-level modules implement the abstraction
class EmailSender implements NotificationSender {
    public void send(String message) {
        // Code to send email
    }
}

class SMSSender implements NotificationSender {
    public void send(String message) {
        // Code to send SMS
    }
}