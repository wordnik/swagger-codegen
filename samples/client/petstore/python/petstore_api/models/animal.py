# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class Animal(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, class_name=None, color='red'):
        """
        Animal - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'class_name': 'str',
            'color': 'str'
        }

        self.attribute_map = {
            'class_name': 'className',
            'color': 'color'
        }

        self._class_name = None
        self._color = None

        if class_name is not None:
          self.class_name = class_name
        if color is not None:
          self.color = color

    @property
    def class_name(self):
        """
        Gets the class_name of this Animal.

        :return: The class_name of this Animal.
        :rtype: str
        """
        return self._class_name

    @class_name.setter
    def class_name(self, class_name):
        """
        Sets the class_name of this Animal.

        :param class_name: The class_name of this Animal.
        :type: str
        """
        if class_name is None:
            raise ValueError("Invalid value for `class_name`, must not be `None`")

        self._class_name = class_name

    @property
    def color(self):
        """
        Gets the color of this Animal.

        :return: The color of this Animal.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color):
        """
        Sets the color of this Animal.

        :param color: The color of this Animal.
        :type: str
        """

        self._color = color

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, Animal):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
