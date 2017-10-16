# coding: utf-8

from __future__ import absolute_import
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ApiResponse(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    def __init__(self, code=None, type=None, message=None):
        """
        ApiResponse - a model defined in Swagger

        :param code: The code of this ApiResponse.
        :type code: int
        :param type: The type of this ApiResponse.
        :type type: str
        :param message: The message of this ApiResponse.
        :type message: str
        """
        self.swagger_types = {
            'code': int,
            'type': str,
            'message': str
        }

        self.attribute_map = {
            'code': 'code',
            'type': 'type',
            'message': 'message'
        }

        self._code = code
        self._type = type
        self._message = message

    @classmethod
    def from_dict(cls, dikt):
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiResponse of this ApiResponse.
        :rtype: ApiResponse
        """
        return deserialize_model(dikt, cls)

    @property
    def code(self):
        """
        Gets the code of this ApiResponse.

        :return: The code of this ApiResponse.
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this ApiResponse.

        :param code: The code of this ApiResponse.
        :type code: int
        """

        self._code = code

    @property
    def type(self):
        """
        Gets the type of this ApiResponse.

        :return: The type of this ApiResponse.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ApiResponse.

        :param type: The type of this ApiResponse.
        :type type: str
        """

        self._type = type

    @property
    def message(self):
        """
        Gets the message of this ApiResponse.

        :return: The message of this ApiResponse.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this ApiResponse.

        :param message: The message of this ApiResponse.
        :type message: str
        """

        self._message = message

