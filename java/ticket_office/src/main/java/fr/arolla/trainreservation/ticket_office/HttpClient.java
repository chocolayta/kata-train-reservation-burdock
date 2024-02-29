package fr.arolla.trainreservation.ticket_office;

public interface HttpClient {
  String get(String url);
  void post(String url, String payload);
}
