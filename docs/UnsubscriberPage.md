

# UnsubscriberPage

Represents a given page of unsubscriber objects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Unsubscriber&gt;**](Unsubscriber.md) | An array containing unsubscriber objects. |  [optional] |
|**cursor** | [**PageCursor**](PageCursor.md) |  |  [optional] |
|**offset** | **Integer** | The position of the item this page starts from, zero-based. e.g., the 11th item is at offset 10. |  |
|**limit** | **Integer** | A limit on the number of items to be returned, between 1 and 100, defaults to 10. |  |
|**length** | **Integer** | The actual number of items in the page. |  |
|**total** | **Integer** | The total number of items. This field is returned only when the request parameter &#x60;includeTotal&#x60; is set to &#x60;true&#x60;. |  [optional] |



