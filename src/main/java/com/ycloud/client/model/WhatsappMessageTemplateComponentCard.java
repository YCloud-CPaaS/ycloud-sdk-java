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
import com.ycloud.client.model.WhatsappMessageTemplateComponentCardComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Card component containing the parameters of the message.
 */
@ApiModel(description = "Card component containing the parameters of the message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageTemplateComponentCard {
  public static final String SERIALIZED_NAME_CARD_INDEX = "card_index";
  /**
   * **Required.** Zero-indexed order in which card appears within the card carousel. 0 indicates first card, 1 indicates second card, etc.
  **/
  @SerializedName(SERIALIZED_NAME_CARD_INDEX)
  private Integer cardIndex;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  /**
   * Card component.
  **/
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<WhatsappMessageTemplateComponentCardComponent> components = null;

  public WhatsappMessageTemplateComponentCard() { 
  }

  public WhatsappMessageTemplateComponentCard cardIndex(Integer cardIndex) {
    
    this.cardIndex = cardIndex;
    return this;
  }

   /**
   * **Required.** Zero-indexed order in which card appears within the card carousel. 0 indicates first card, 1 indicates second card, etc.
   * minimum: 0
   * maximum: 9
   * @return cardIndex
  **/
  @javax.annotation.Nullable

  public Integer getCardIndex() {
    return cardIndex;
  }


  /**
   * **Required.** Zero-indexed order in which card appears within the card carousel. 0 indicates first card, 1 indicates second card, etc.
   **/
  @ApiModelProperty(value = "**Required.** Zero-indexed order in which card appears within the card carousel. 0 indicates first card, 1 indicates second card, etc.")
  public void setCardIndex(Integer cardIndex) {
    this.cardIndex = cardIndex;
  }


  public WhatsappMessageTemplateComponentCard components(List<WhatsappMessageTemplateComponentCardComponent> components) {
    
    this.components = components;
    return this;
  }

  public WhatsappMessageTemplateComponentCard addComponentsItem(WhatsappMessageTemplateComponentCardComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Card component.
   * @return components
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageTemplateComponentCardComponent> getComponents() {
    return components;
  }


  /**
   * Card component.
   **/
  @ApiModelProperty(value = "Card component.")
  public void setComponents(List<WhatsappMessageTemplateComponentCardComponent> components) {
    this.components = components;
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
  public WhatsappMessageTemplateComponentCard putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageTemplateComponentCard whatsappMessageTemplateComponentCard = (WhatsappMessageTemplateComponentCard) o;
    return Objects.equals(this.cardIndex, whatsappMessageTemplateComponentCard.cardIndex) &&
        Objects.equals(this.components, whatsappMessageTemplateComponentCard.components)&&
        Objects.equals(this.additionalProperties, whatsappMessageTemplateComponentCard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardIndex, components, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageTemplateComponentCard {\n");
    sb.append("    cardIndex: ").append(toIndentedString(cardIndex)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
    openapiFields.add("card_index");
    openapiFields.add("components");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageTemplateComponentCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageTemplateComponentCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageTemplateComponentCard is not found in the empty JSON string", WhatsappMessageTemplateComponentCard.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      if (jsonArraycomponents != null) {
        // ensure the json data is an array
        if (!jsonObj.get("components").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
        }

        // validate the optional field `components` (array)
        for (int i = 0; i < jsonArraycomponents.size(); i++) {
          WhatsappMessageTemplateComponentCardComponent.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageTemplateComponentCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageTemplateComponentCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageTemplateComponentCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageTemplateComponentCard.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageTemplateComponentCard>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageTemplateComponentCard value) throws IOException {
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
           public WhatsappMessageTemplateComponentCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageTemplateComponentCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageTemplateComponentCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageTemplateComponentCard
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageTemplateComponentCard
  */
  public static WhatsappMessageTemplateComponentCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageTemplateComponentCard.class);
  }

 /**
  * Convert an instance of WhatsappMessageTemplateComponentCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

