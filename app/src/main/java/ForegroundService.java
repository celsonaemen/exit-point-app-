public class TrackingService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startForeground(1, createNotification());
        // Implemente a lógica de monitoramento de localização aqui
        return START_STICKY;
    }

    private Notification createNotification() {
        // Crie uma notificação persistente para Android 8+
    }
}private void checkProximity(Location currentLocation) {
    float[] results = new float[1];
    Location.distanceBetween(
            currentLocation.getLatitude(),
            currentLocation.getLongitude(),
            destination.getLatitude(),
            destination.getLongitude(),
            results
    );

    if (results[0] <= selectedDistance * 1000) {
        triggerAlarm();
    }
}

private void triggerAlarm() {
    // Toque o alarme selecionado usando MediaPlayer
}