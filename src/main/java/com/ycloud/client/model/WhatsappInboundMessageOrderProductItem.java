/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ycloud.client.JSON;

/**
 * WhatsappInboundMessageOrderProductItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappInboundMessageOrderProductItem {
  public static final String SERIALIZED_NAME_PRODUCT_RETAILER_ID = "product_retailer_id";
  /**
   * The product SKU identifier.
  **/
  @SerializedName(SERIALIZED_NAME_PRODUCT_RETAILER_ID)
  private String productRetailerId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  /**
   * Number of item.
  **/
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "item_price";
  /**
   * Unitary price of item.
  **/
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private Double itemPrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
  **/
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public WhatsappInboundMessageOrderProductItem() { 
  }

  public WhatsappInboundMessageOrderProductItem productRetailerId(String productRetailerId) {
    
    this.productRetailerId = productRetailerId;
    return this;
  }

   /**
   * The product SKU identifier.
   * @return productRetailerId
  **/
  @javax.annotation.Nullable

  public String getProductRetailerId() {
    return productRetailerId;
  }


  /**
   * The product SKU identifier.
   **/
  @ApiModelProperty(value = "The product SKU identifier.")
  public void setProductRetailerId(String productRetailerId) {
    this.productRetailerId = productRetailerId;
  }


  public WhatsappInboundMessageOrderProductItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of item.
   * @return quantity
  **/
  @javax.annotation.Nullable

  public Integer getQuantity() {
    return quantity;
  }


  /**
   * Number of item.
   **/
  @ApiModelProperty(value = "Number of item.")
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public WhatsappInboundMessageOrderProductItem itemPrice(Double itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * Unitary price of item.
   * @return itemPrice
  **/
  @javax.annotation.Nullable

  public Double getItemPrice() {
    return itemPrice;
  }


  /**
   * Unitary price of item.
   **/
  @ApiModelProperty(value = "Unitary price of item.")
  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }


  public WhatsappInboundMessageOrderProductItem currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   **/
  @ApiModelProperty(example = "USD", value = "Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public WhatsappInboundMessageOrderProductItem putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappInboundMessageOrderProductItem whatsappInboundMessageOrderProductItem = (WhatsappInboundMessageOrderProductItem) o;
    return Objects.equals(this.productRetailerId, whatsappInboundMessageOrderProductItem.productRetailerId) &&
        Objects.equals(this.quantity, whatsappInboundMessageOrderProductItem.quantity) &&
        Objects.equals(this.itemPrice, whatsappInboundMessageOrderProductItem.itemPrice) &&
        Objects.equals(this.currency, whatsappInboundMessageOrderProductItem.currency)&&
        Objects.equals(this.additionalProperties, whatsappInboundMessageOrderProductItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRetailerId, quantity, itemPrice, currency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappInboundMessageOrderProductItem {\n");
    sb.append("    productRetailerId: ").append(toIndentedString(productRetailerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("product_retailer_id");
    openapiFields.add("quantity");
    openapiFields.add("item_price");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappInboundMessageOrderProductItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappInboundMessageOrderProductItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappInboundMessageOrderProductItem is not found in the empty JSON string", WhatsappInboundMessageOrderProductItem.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("product_retailer_id") != null && !jsonObj.get("product_retailer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_retailer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_retailer_id").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappInboundMessageOrderProductItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappInboundMessageOrderProductItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappInboundMessageOrderProductItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappInboundMessageOrderProductItem.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappInboundMessageOrderProductItem>() {
           @Override
           public void write(JsonWriter out, WhatsappInboundMessageOrderProductItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WhatsappInboundMessageOrderProductItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappInboundMessageOrderProductItem instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WhatsappInboundMessageOrderProductItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappInboundMessageOrderProductItem
  * @throws IOException if the JSON string is invalid with respect to WhatsappInboundMessageOrderProductItem
  */
  public static WhatsappInboundMessageOrderProductItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappInboundMessageOrderProductItem.class);
  }

 /**
  * Convert an instance of WhatsappInboundMessageOrderProductItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

