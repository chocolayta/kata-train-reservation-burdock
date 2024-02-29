package fr.arolla.trainreservation.ticket_office;

public class FakeRestTemplateService implements RestTemplateService{
    @Override
    public <T> T postForObject(String url, Object request, Class<T> responseType) {
      Seat reservedSeat1 = new Seat("1A", "A", "booking_reference_1");
      Seat reservedSeat2 = new Seat("2A", "A","booking_reference_2");
        return null;
    }
}
