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


class Capitalization(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, small_camel=None, capital_camel=None, small_snake=None, capital_snake=None, sca_eth_flow_points=None, att_name=None):
        """
        Capitalization - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'small_camel': 'str',
            'capital_camel': 'str',
            'small_snake': 'str',
            'capital_snake': 'str',
            'sca_eth_flow_points': 'str',
            'att_name': 'str'
        }

        self.attribute_map = {
            'small_camel': 'smallCamel',
            'capital_camel': 'CapitalCamel',
            'small_snake': 'small_Snake',
            'capital_snake': 'Capital_Snake',
            'sca_eth_flow_points': 'SCA_ETH_Flow_Points',
            'att_name': 'ATT_NAME'
        }

        self._small_camel = None
        self._capital_camel = None
        self._small_snake = None
        self._capital_snake = None
        self._sca_eth_flow_points = None
        self._att_name = None

        # TODO: let required properties as mandatory parameter in the constructor.
        #       - to check if required property is not None (e.g. by calling setter)
        #       - ApiClient.__deserialize_model has to be adapted as well
        if small_camel is not None:
          self.small_camel = small_camel
        if capital_camel is not None:
          self.capital_camel = capital_camel
        if small_snake is not None:
          self.small_snake = small_snake
        if capital_snake is not None:
          self.capital_snake = capital_snake
        if sca_eth_flow_points is not None:
          self.sca_eth_flow_points = sca_eth_flow_points
        if att_name is not None:
          self.att_name = att_name

    @property
    def small_camel(self):
        """
        Gets the small_camel of this Capitalization.

        :return: The small_camel of this Capitalization.
        :rtype: str
        """
        return self._small_camel

    @small_camel.setter
    def small_camel(self, small_camel):
        """
        Sets the small_camel of this Capitalization.

        :param small_camel: The small_camel of this Capitalization.
        :type: str
        """

        self._small_camel = small_camel

    @property
    def capital_camel(self):
        """
        Gets the capital_camel of this Capitalization.

        :return: The capital_camel of this Capitalization.
        :rtype: str
        """
        return self._capital_camel

    @capital_camel.setter
    def capital_camel(self, capital_camel):
        """
        Sets the capital_camel of this Capitalization.

        :param capital_camel: The capital_camel of this Capitalization.
        :type: str
        """

        self._capital_camel = capital_camel

    @property
    def small_snake(self):
        """
        Gets the small_snake of this Capitalization.

        :return: The small_snake of this Capitalization.
        :rtype: str
        """
        return self._small_snake

    @small_snake.setter
    def small_snake(self, small_snake):
        """
        Sets the small_snake of this Capitalization.

        :param small_snake: The small_snake of this Capitalization.
        :type: str
        """

        self._small_snake = small_snake

    @property
    def capital_snake(self):
        """
        Gets the capital_snake of this Capitalization.

        :return: The capital_snake of this Capitalization.
        :rtype: str
        """
        return self._capital_snake

    @capital_snake.setter
    def capital_snake(self, capital_snake):
        """
        Sets the capital_snake of this Capitalization.

        :param capital_snake: The capital_snake of this Capitalization.
        :type: str
        """

        self._capital_snake = capital_snake

    @property
    def sca_eth_flow_points(self):
        """
        Gets the sca_eth_flow_points of this Capitalization.

        :return: The sca_eth_flow_points of this Capitalization.
        :rtype: str
        """
        return self._sca_eth_flow_points

    @sca_eth_flow_points.setter
    def sca_eth_flow_points(self, sca_eth_flow_points):
        """
        Sets the sca_eth_flow_points of this Capitalization.

        :param sca_eth_flow_points: The sca_eth_flow_points of this Capitalization.
        :type: str
        """

        self._sca_eth_flow_points = sca_eth_flow_points

    @property
    def att_name(self):
        """
        Gets the att_name of this Capitalization.
        Name of the pet 

        :return: The att_name of this Capitalization.
        :rtype: str
        """
        return self._att_name

    @att_name.setter
    def att_name(self, att_name):
        """
        Sets the att_name of this Capitalization.
        Name of the pet 

        :param att_name: The att_name of this Capitalization.
        :type: str
        """

        self._att_name = att_name

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
        if not isinstance(other, Capitalization):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
