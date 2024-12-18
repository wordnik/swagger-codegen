# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Api.AnotherFake do
  @moduledoc """
  API calls for all endpoints tagged `AnotherFake`.
  """

  alias SwaggerPetstore.Connection
  import SwaggerPetstore.RequestBuilder


  @doc """
  To test special tags
  To test special tags

  ## Parameters

  - connection (`SwaggerPetstore.Connection`): Connection to server
  - body (`Client`): client model
  - opts (`KeywordList`): [optional] Optional parameters

  ## Returns

  `{:ok, SwaggerPetstore.Model.Client}` on success
  `{:error, info}` on failure
  """
  @spec test_special_tags(Tesla.Env.client, SwaggerPetstore.Model.Client.t, keyword()) :: {:ok, SwaggerPetstore.Model.Client.t} | {:error, Tesla.Env.t}
  def test_special_tags(connection, body, _opts \\ []) do
    %{}
    |> method(:patch)
    |> url("/another-fake/dummy")
    |> add_param(:body, :"body", body)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.Client{})
  end
end
