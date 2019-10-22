# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from api.fake_api import FakeApi  # noqa: E501
from swagger_client.rest import ApiException


class TestFakeApi(unittest.TestCase):
    """FakeApi unit test stubs"""

    def setUp(self):
        self.api = api.fake_api.FakeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_fake_outer_boolean_serialize(self):
        """Test case for fake_outer_boolean_serialize

        """
        pass

    def test_fake_outer_composite_serialize(self):
        """Test case for fake_outer_composite_serialize

        """
        pass

    def test_fake_outer_number_serialize(self):
        """Test case for fake_outer_number_serialize

        """
        pass

    def test_fake_outer_string_serialize(self):
        """Test case for fake_outer_string_serialize

        """
        pass

    def test_test_client_model(self):
        """Test case for test_client_model

        To test \"client\" model  # noqa: E501
        """
        pass

    def test_test_endpoint_parameters(self):
        """Test case for test_endpoint_parameters

        Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트   # noqa: E501
        """
        pass

    def test_test_enum_parameters(self):
        """Test case for test_enum_parameters

        To test enum parameters  # noqa: E501
        """
        pass

    def test_test_enum_request_body(self):
        """Test case for test_enum_request_body

        To test enum parameters  # noqa: E501
        """
        pass

    def test_test_inline_additional_properties(self):
        """Test case for test_inline_additional_properties

        test inline additionalProperties  # noqa: E501
        """
        pass

    def test_test_json_form_data(self):
        """Test case for test_json_form_data

        test json serialization of form data  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
