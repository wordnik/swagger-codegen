# coding: utf-8

"""
Copyright 2016 SmartBear Software

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    Ref: https://github.com/swagger-api/swagger-codegen
"""

from pprint import pformat
from six import iteritems
import re


class MixedPropertiesAndAdditionalPropertiesClass(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        MixedPropertiesAndAdditionalPropertiesClass - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'uuid': 'str',
            'date_time': 'datetime'
        }

        self.attribute_map = {
            'uuid': 'uuid',
            'date_time': 'dateTime'
        }

        self._uuid = None
        self._date_time = None

    @property
    def uuid(self):
        """
        Gets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.


        :return: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """
        Sets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.


        :param uuid: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.
        :type: str
        """
        
        self._uuid = uuid

    @property
    def date_time(self):
        """
        Gets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.


        :return: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.
        :rtype: datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time):
        """
        Sets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.


        :param date_time: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.
        :type: datetime
        """
        
        self._date_time = date_time

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
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other

