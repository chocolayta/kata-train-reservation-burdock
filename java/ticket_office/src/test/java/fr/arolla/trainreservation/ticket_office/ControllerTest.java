package fr.arolla.trainreservation.ticket_office;

import fr.arolla.trainreservation.ticket_office.controllers.BookingController;
import fr.arolla.trainreservation.ticket_office.controllers.BookingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ControllerTest {
  @Test
  void reserve_two_seats_from_empty_train() {
    final String trainId = "express_2000";
    var restTemplate = new RestTemplate();
    restTemplate.postForObject("http://127.0.0.1:8081" + "/reset/" + trainId, null, String.class);
    var controller = new BookingController();

    var request = new BookingRequest(trainId, 2);
    var response = controller.reserve(request);

    assertThat(response.seats()).hasSize(2);
  }
}