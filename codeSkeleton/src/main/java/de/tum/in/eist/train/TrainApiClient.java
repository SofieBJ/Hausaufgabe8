package de.tum.in.eist.train;

import java.io.IOException;

import javax.inject.Inject;

import com.google.appengine.api.urlfetch.URLFetchService;

import de.tum.in.eist.Location;

/**
 * Client to query {@link TrainAPI} and parse the 
 * JSON response to respective POJO
 */
public class TrainApiClient {

  private final URLFetchService service;

  @Inject
  public TrainApiClient(URLFetchService service) {
    this.service = service;
  }

  /**
   * Sends a http GET request to {@link TrainAPI}
   * to make train trip. 
   */
  public TrainTrip trainTrip(String userClass, int seats, Location origin, Location destination) throws IOException {
    /*
     * Develop a method for TrainAPI makeTrip call (For example see - RentalCarApiClient)
     * Hint - See format of makeTrip call in TrainAPI
     * Hint - Make toTrainTrip(JsonObject response) to validate and
     *        return data in TrainTrip POJO
     */
    return null;
  }

}
