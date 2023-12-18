class NotificationService {
    public void sendEmailNotification(String message) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(message);
    }
}
