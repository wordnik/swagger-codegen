package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import play.libs.F;
import retrofit2.Response;

public interface StoreApi {
  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/order/{orderId}")
  F.Promise<Response<Void>> deleteOrder(
    @retrofit2.http.Path("orderId") String orderId
  );

  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Call&lt;Map&lt;String, Integer&gt;&gt;
   */
  @GET("store/inventory")
  F.Promise<Response<Map<String, Integer>>> getInventory();
    

  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return Call&lt;Order&gt;
   */
  @GET("store/order/{orderId}")
  F.Promise<Response<Order>> getOrderById(
    @retrofit2.http.Path("orderId") Long orderId
  );

  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return Call&lt;Order&gt;
   */
  @POST("store/order")
  F.Promise<Response<Order>> placeOrder(
    @retrofit2.http.Body Order body
  );

}
