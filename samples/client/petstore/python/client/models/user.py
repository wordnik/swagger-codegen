#!/usr/bin/env python
# coding: utf-8

"""
Copyright 2015 Reverb Technologies, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

class User(object):
    """NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually."""


    def __init__(self):
        """
        Attributes:
          swaggerTypes (dict): The key is attribute name and the value is attribute type.
          attributeMap (dict): The key is attribute name and the value is json key in definition.
        """
        self.swaggerTypes = {
            
            'id': 'long',
            
            
            'username': 'str',
            
            
            'first_name': 'str',
            
            
            'last_name': 'str',
            
            
            'email': 'str',
            
            
            'password': 'str',
            
            
            'phone': 'str',
            
            
            'user_status': 'int'
            
        }

        self.attributeMap = {
            
            'id': 'id',
            
            'username': 'username',
            
            'first_name': 'firstName',
            
            'last_name': 'lastName',
            
            'email': 'email',
            
            'password': 'password',
            
            'phone': 'phone',
            
            'user_status': 'userStatus'
            
        }

        
        
        self.id = None # long
        
        
        self.username = None # str
        
        
        self.first_name = None # str
        
        
        self.last_name = None # str
        
        
        self.email = None # str
        
        
        self.password = None # str
        
        
        self.phone = None # str
        
        #User Status
        
        self.user_status = None # int
        
