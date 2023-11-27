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
import com.ycloud.client.model.WhatsappMessageTemplateComponentCard;
import com.ycloud.client.model.WhatsappMessageTemplateComponentParameter;
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
 * Component object containing the parameters of the message.
 */
@ApiModel(description = "Component object containing the parameters of the message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageTemplateComponent {
  /**
   * Component type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HEADER("header"),
    
    BODY("body"),
    
    BUTTON("button"),
    
    LIMITED_TIME_OFFER("limited_time_offer"),
    
    CAROUSEL("carousel");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
   * Component type.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * **Required when type is &#x60;button&#x60;.** Type of button. - &#x60;quick_reply&#x60;: Refers to a previously created quick reply button that allows for the customer to return a predefined message. - &#x60;url&#x60;: Refers to a previously created url button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template. - &#x60;copy_code&#x60;: Refers to a previously created copy code button that allows the customer to copy a text string (defined when the template is sent in a template message) to the device&#39;s clipboard when tapped by the app user. - &#x60;catalog&#x60;: Refers to a previously created catalog button that allows the customer to view your product catalog. - &#x60;mpm&#x60;: Refers to a previously created MPM (multi-product message) button that allows the customer to browser products and sections.
   */
  @JsonAdapter(SubTypeEnum.Adapter.class)
  public enum SubTypeEnum {
    QUICK_REPLY("quick_reply"),
    
    URL("url"),
    
    COPY_CODE("copy_code"),
    
    CATALOG("catalog"),
    
    MPM("mpm");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypeEnum fromValue(String value) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUB_TYPE = "sub_type";
  /**
   * **Required when type is &#x60;button&#x60;.** Type of button. - &#x60;quick_reply&#x60;: Refers to a previously created quick reply button that allows for the customer to return a predefined message. - &#x60;url&#x60;: Refers to a previously created url button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template. - &#x60;copy_code&#x60;: Refers to a previously created copy code button that allows the customer to copy a text string (defined when the template is sent in a template message) to the device&#39;s clipboard when tapped by the app user. - &#x60;catalog&#x60;: Refers to a previously created catalog button that allows the customer to view your product catalog. - &#x60;mpm&#x60;: Refers to a previously created MPM (multi-product message) button that allows the customer to browser products and sections.
  **/
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private SubTypeEnum subType;

  public static final String SERIALIZED_NAME_INDEX = "index";
  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;. Not used for the other types.** Indicates order in which button should appear, if the template uses multiple buttons. Buttons are zero-indexed, so setting value to 0 will cause the button to appear first, and another button with an index of 1 will appear next, etc.
  **/
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;, or there are variables in the corresponding template component, or the template &#x60;HEADER&#x60; format is media (&#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;).** Array of parameter objects with the content of the message. For components of &#x60;type&#x60; &#x3D; &#x60;button&#x60;, see the [button parameter object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#button-parameter-object).
  **/
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<WhatsappMessageTemplateComponentParameter> parameters = null;

  public static final String SERIALIZED_NAME_CARDS = "cards";
  /**
   * Use for &#x60;carousel&#x60; components. Provides card components containing the parameters of the message.
  **/
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<WhatsappMessageTemplateComponentCard> cards = null;

  public WhatsappMessageTemplateComponent() { 
  }

  public WhatsappMessageTemplateComponent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Component type.
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  /**
   * Component type.
   **/
  @ApiModelProperty(required = true, value = "Component type.")
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WhatsappMessageTemplateComponent subType(SubTypeEnum subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * **Required when type is &#x60;button&#x60;.** Type of button. - &#x60;quick_reply&#x60;: Refers to a previously created quick reply button that allows for the customer to return a predefined message. - &#x60;url&#x60;: Refers to a previously created url button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template. - &#x60;copy_code&#x60;: Refers to a previously created copy code button that allows the customer to copy a text string (defined when the template is sent in a template message) to the device&#39;s clipboard when tapped by the app user. - &#x60;catalog&#x60;: Refers to a previously created catalog button that allows the customer to view your product catalog. - &#x60;mpm&#x60;: Refers to a previously created MPM (multi-product message) button that allows the customer to browser products and sections.
   * @return subType
  **/
  @javax.annotation.Nullable

  public SubTypeEnum getSubType() {
    return subType;
  }


  /**
   * **Required when type is &#x60;button&#x60;.** Type of button. - &#x60;quick_reply&#x60;: Refers to a previously created quick reply button that allows for the customer to return a predefined message. - &#x60;url&#x60;: Refers to a previously created url button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template. - &#x60;copy_code&#x60;: Refers to a previously created copy code button that allows the customer to copy a text string (defined when the template is sent in a template message) to the device&#39;s clipboard when tapped by the app user. - &#x60;catalog&#x60;: Refers to a previously created catalog button that allows the customer to view your product catalog. - &#x60;mpm&#x60;: Refers to a previously created MPM (multi-product message) button that allows the customer to browser products and sections.
   **/
  @ApiModelProperty(value = "**Required when type is `button`.** Type of button. - `quick_reply`: Refers to a previously created quick reply button that allows for the customer to return a predefined message. - `url`: Refers to a previously created url button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template. - `copy_code`: Refers to a previously created copy code button that allows the customer to copy a text string (defined when the template is sent in a template message) to the device's clipboard when tapped by the app user. - `catalog`: Refers to a previously created catalog button that allows the customer to view your product catalog. - `mpm`: Refers to a previously created MPM (multi-product message) button that allows the customer to browser products and sections.")
  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  public WhatsappMessageTemplateComponent index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;. Not used for the other types.** Indicates order in which button should appear, if the template uses multiple buttons. Buttons are zero-indexed, so setting value to 0 will cause the button to appear first, and another button with an index of 1 will appear next, etc.
   * minimum: 0
   * maximum: 9
   * @return index
  **/
  @javax.annotation.Nullable

  public Integer getIndex() {
    return index;
  }


  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;. Not used for the other types.** Indicates order in which button should appear, if the template uses multiple buttons. Buttons are zero-indexed, so setting value to 0 will cause the button to appear first, and another button with an index of 1 will appear next, etc.
   **/
  @ApiModelProperty(value = "**Required when `type` = `button`. Not used for the other types.** Indicates order in which button should appear, if the template uses multiple buttons. Buttons are zero-indexed, so setting value to 0 will cause the button to appear first, and another button with an index of 1 will appear next, etc.")
  public void setIndex(Integer index) {
    this.index = index;
  }


  public WhatsappMessageTemplateComponent parameters(List<WhatsappMessageTemplateComponentParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public WhatsappMessageTemplateComponent addParametersItem(WhatsappMessageTemplateComponentParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;, or there are variables in the corresponding template component, or the template &#x60;HEADER&#x60; format is media (&#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;).** Array of parameter objects with the content of the message. For components of &#x60;type&#x60; &#x3D; &#x60;button&#x60;, see the [button parameter object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#button-parameter-object).
   * @return parameters
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageTemplateComponentParameter> getParameters() {
    return parameters;
  }


  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;button&#x60;, or there are variables in the corresponding template component, or the template &#x60;HEADER&#x60; format is media (&#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;).** Array of parameter objects with the content of the message. For components of &#x60;type&#x60; &#x3D; &#x60;button&#x60;, see the [button parameter object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#button-parameter-object).
   **/
  @ApiModelProperty(value = "**Required when `type` = `button`, or there are variables in the corresponding template component, or the template `HEADER` format is media (`IMAGE`, `VIDEO`, or `DOCUMENT`).** Array of parameter objects with the content of the message. For components of `type` = `button`, see the [button parameter object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#button-parameter-object).")
  public void setParameters(List<WhatsappMessageTemplateComponentParameter> parameters) {
    this.parameters = parameters;
  }


  public WhatsappMessageTemplateComponent cards(List<WhatsappMessageTemplateComponentCard> cards) {
    
    this.cards = cards;
    return this;
  }

  public WhatsappMessageTemplateComponent addCardsItem(WhatsappMessageTemplateComponentCard cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * Use for &#x60;carousel&#x60; components. Provides card components containing the parameters of the message.
   * @return cards
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageTemplateComponentCard> getCards() {
    return cards;
  }


  /**
   * Use for &#x60;carousel&#x60; components. Provides card components containing the parameters of the message.
   **/
  @ApiModelProperty(value = "Use for `carousel` components. Provides card components containing the parameters of the message.")
  public void setCards(List<WhatsappMessageTemplateComponentCard> cards) {
    this.cards = cards;
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
  public WhatsappMessageTemplateComponent putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageTemplateComponent whatsappMessageTemplateComponent = (WhatsappMessageTemplateComponent) o;
    return Objects.equals(this.type, whatsappMessageTemplateComponent.type) &&
        Objects.equals(this.subType, whatsappMessageTemplateComponent.subType) &&
        Objects.equals(this.index, whatsappMessageTemplateComponent.index) &&
        Objects.equals(this.parameters, whatsappMessageTemplateComponent.parameters) &&
        Objects.equals(this.cards, whatsappMessageTemplateComponent.cards)&&
        Objects.equals(this.additionalProperties, whatsappMessageTemplateComponent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subType, index, parameters, cards, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageTemplateComponent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("sub_type");
    openapiFields.add("index");
    openapiFields.add("parameters");
    openapiFields.add("cards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageTemplateComponent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageTemplateComponent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageTemplateComponent is not found in the empty JSON string", WhatsappMessageTemplateComponent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageTemplateComponent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("sub_type") != null && !jsonObj.get("sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_type").toString()));
      }
      JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
      if (jsonArrayparameters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("parameters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
        }

        // validate the optional field `parameters` (array)
        for (int i = 0; i < jsonArrayparameters.size(); i++) {
          WhatsappMessageTemplateComponentParameter.validateJsonObject(jsonArrayparameters.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycards = jsonObj.getAsJsonArray("cards");
      if (jsonArraycards != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cards").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
        }

        // validate the optional field `cards` (array)
        for (int i = 0; i < jsonArraycards.size(); i++) {
          WhatsappMessageTemplateComponentCard.validateJsonObject(jsonArraycards.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageTemplateComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageTemplateComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageTemplateComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageTemplateComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageTemplateComponent>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageTemplateComponent value) throws IOException {
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
           public WhatsappMessageTemplateComponent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageTemplateComponent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageTemplateComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageTemplateComponent
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageTemplateComponent
  */
  public static WhatsappMessageTemplateComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageTemplateComponent.class);
  }

 /**
  * Convert an instance of WhatsappMessageTemplateComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

