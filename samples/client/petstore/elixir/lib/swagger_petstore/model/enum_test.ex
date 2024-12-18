# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Model.EnumTest do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :enum_string,
    :enum_string_required,
    :enum_integer,
    :enum_number,
    :outerEnum
  ]

  @type t :: %__MODULE__{
    :enum_string => String.t,
    :enum_string_required => String.t,
    :enum_integer => integer(),
    :enum_number => float(),
    :outerEnum => SwaggerPetstore.Model.OuterEnum
  }
end

defimpl Poison.Decoder, for: SwaggerPetstore.Model.EnumTest do
  import SwaggerPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:outerEnum, :struct, SwaggerPetstore.Model.OuterEnum, options)
  end
end

