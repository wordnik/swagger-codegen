# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Api.Fake do
  @moduledoc """
  API calls for all endpoints tagged `Fake`.
  """

  alias SwaggerPetstore.Connection
  import SwaggerPetstore.RequestBuilder


  @doc """
  Test serialization of outer boolean types

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (OuterBoolean): Input boolean as post body

  ## Returns

  {:ok, %SwaggerPetstore.Model.OuterBoolean{}} on success
  {:error, info} on failure
  """
  @spec fake_outer_boolean_serialize(Tesla.Env.client, keyword()) :: {:ok, SwaggerPetstore.Model.OuterBoolean.t} | {:error, Tesla.Env.t}
  def fake_outer_boolean_serialize(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/fake/outer/boolean")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.OuterBoolean{})
  end

  @doc """
  Test serialization of object with outer number type

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (OuterComposite): Input composite as post body

  ## Returns

  {:ok, %SwaggerPetstore.Model.OuterComposite{}} on success
  {:error, info} on failure
  """
  @spec fake_outer_composite_serialize(Tesla.Env.client, keyword()) :: {:ok, SwaggerPetstore.Model.OuterComposite.t} | {:error, Tesla.Env.t}
  def fake_outer_composite_serialize(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/fake/outer/composite")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.OuterComposite{})
  end

  @doc """
  Test serialization of outer number types

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (OuterNumber): Input number as post body

  ## Returns

  {:ok, %SwaggerPetstore.Model.OuterNumber{}} on success
  {:error, info} on failure
  """
  @spec fake_outer_number_serialize(Tesla.Env.client, keyword()) :: {:ok, SwaggerPetstore.Model.OuterNumber.t} | {:error, Tesla.Env.t}
  def fake_outer_number_serialize(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/fake/outer/number")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.OuterNumber{})
  end

  @doc """
  Test serialization of outer string types

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (OuterString): Input string as post body

  ## Returns

  {:ok, %SwaggerPetstore.Model.OuterString{}} on success
  {:error, info} on failure
  """
  @spec fake_outer_string_serialize(Tesla.Env.client, keyword()) :: {:ok, SwaggerPetstore.Model.OuterString.t} | {:error, Tesla.Env.t}
  def fake_outer_string_serialize(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/fake/outer/string")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.OuterString{})
  end

  @doc """

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - body (User): 
  - query (String.t): 
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec test_body_with_query_params(Tesla.Env.client, SwaggerPetstore.Model.User.t, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def test_body_with_query_params(connection, body, query, _opts \\ []) do
    %{}
    |> method(:put)
    |> url("/fake/body-with-query-params")
    |> add_param(:body, :"body", body)
    |> add_param(:query, :"query", query)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  To test \&quot;client\&quot; model
  To test \&quot;client\&quot; model

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - body (Client): client model
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %SwaggerPetstore.Model.Client{}} on success
  {:error, info} on failure
  """
  @spec test_client_model(Tesla.Env.client, SwaggerPetstore.Model.Client.t, keyword()) :: {:ok, SwaggerPetstore.Model.Client.t} | {:error, Tesla.Env.t}
  def test_client_model(connection, body, _opts \\ []) do
    %{}
    |> method(:patch)
    |> url("/fake")
    |> add_param(:body, :"body", body)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.Client{})
  end

  @doc """
  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - number (float()): None
  - double (float()): None
  - pattern_without_delimiter (String.t): None
  - byte (binary()): None
  - opts (KeywordList): [optional] Optional parameters
    - :integer (integer()): None
    - :int32 (integer()): None
    - :int64 (integer()): None
    - :float (float()): None
    - :string (String.t): None
    - :binary (binary()): None
    - :date (Date.t): None
    - :date_time (DateTime.t): None
    - :password (String.t): None
    - :callback (String.t): None

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec test_endpoint_parameters(Tesla.Env.client, float(), float(), String.t, binary(), keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def test_endpoint_parameters(connection, number, double, pattern_without_delimiter, byte, opts \\ []) do
    optional_params = %{
      :integer => :form,
      :int32 => :form,
      :int64 => :form,
      :float => :form,
      :string => :form,
      :binary => :form,
      :date => :form,
      :dateTime => :form,
      :password => :form,
      :callback => :form
    }
    %{}
    |> method(:post)
    |> url("/fake")
    |> add_param(:form, :"number", number)
    |> add_param(:form, :"double", double)
    |> add_param(:form, :"pattern_without_delimiter", pattern_without_delimiter)
    |> add_param(:form, :"byte", byte)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  To test enum parameters
  To test enum parameters

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :enum_form_string_array ([String.t]): Form parameter enum test (string array)
    - :enum_form_string (String.t): Form parameter enum test (string)
    - :enum_header_string_array ([String.t]): Header parameter enum test (string array)
    - :enum_header_string (String.t): Header parameter enum test (string)
    - :enum_query_string_array ([String.t]): Query parameter enum test (string array)
    - :enum_query_string (String.t): Query parameter enum test (string)
    - :enum_query_integer (integer()): Query parameter enum test (double)
    - :enum_query_double (float()): Query parameter enum test (double)

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec test_enum_parameters(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def test_enum_parameters(connection, opts \\ []) do
    optional_params = %{
      :enum_form_string_array => :form,
      :enum_form_string => :form,
      :enum_header_string_array => :headers,
      :enum_header_string => :headers,
      :enum_query_string_array => :query,
      :enum_query_string => :query,
      :enum_query_integer => :query,
      :enum_query_double => :form
    }
    %{}
    |> method(:get)
    |> url("/fake")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  test inline additionalProperties
  

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - param (Map): request body
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec test_inline_additional_properties(Tesla.Env.client, Map, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def test_inline_additional_properties(connection, param, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/fake/inline-additionalProperties")
    |> add_param(:body, :"param", param)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  test json serialization of form data
  

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - param (String.t): field1
  - param2 (String.t): field2
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec test_json_form_data(Tesla.Env.client, String.t, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def test_json_form_data(connection, param, param2, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/fake/jsonFormData")
    |> add_param(:form, :"param", param)
    |> add_param(:form, :"param2", param2)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end
end
