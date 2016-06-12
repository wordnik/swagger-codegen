using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing UserApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class UserApiTests
    {
        private UserApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
           instance = new UserApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UserApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
			Assert.IsInstanceOfType(typeof(UserApi), instance, "instance is a UserApi");
        }

        
        /// <summary>
        /// Test CreateUser
        /// </summary>
        [Test]
        public void CreateUserTest()
        {
            // TODO: add unit test for the method 'CreateUser'
            //User body = null; // TODO: replace null with proper value
            //instance.CreateUser(body);
            
        }
        
        /// <summary>
        /// Test CreateUsersWithArrayInput
        /// </summary>
        [Test]
        public void CreateUsersWithArrayInputTest()
        {
            // TODO: add unit test for the method 'CreateUsersWithArrayInput'
            //List<User> body = null; // TODO: replace null with proper value
            //instance.CreateUsersWithArrayInput(body);
            
        }
        
        /// <summary>
        /// Test CreateUsersWithListInput
        /// </summary>
        [Test]
        public void CreateUsersWithListInputTest()
        {
            // TODO: add unit test for the method 'CreateUsersWithListInput'
            //List<User> body = null; // TODO: replace null with proper value
            //instance.CreateUsersWithListInput(body);
            
        }
        
        /// <summary>
        /// Test DeleteUser
        /// </summary>
        [Test]
        public void DeleteUserTest()
        {
            // TODO: add unit test for the method 'DeleteUser'
            //string username = null; // TODO: replace null with proper value
            //instance.DeleteUser(username);
            
        }
        
        /// <summary>
        /// Test GetUserByName
        /// </summary>
        [Test]
        public void GetUserByNameTest()
        {
            // TODO: add unit test for the method 'GetUserByName'
            //string username = null; // TODO: replace null with proper value
            //var response = instance.GetUserByName(username);
            //Assert.IsInstanceOf<User> (response, "response is User");
        }
        
        /// <summary>
        /// Test LoginUser
        /// </summary>
        [Test]
        public void LoginUserTest()
        {
            // TODO: add unit test for the method 'LoginUser'
            //string username = null; // TODO: replace null with proper value
            //string password = null; // TODO: replace null with proper value
            //var response = instance.LoginUser(username, password);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test LogoutUser
        /// </summary>
        [Test]
        public void LogoutUserTest()
        {
            // TODO: add unit test for the method 'LogoutUser'
            //instance.LogoutUser();
            
        }
        
        /// <summary>
        /// Test UpdateUser
        /// </summary>
        [Test]
        public void UpdateUserTest()
        {
            // TODO: add unit test for the method 'UpdateUser'
            //string username = null; // TODO: replace null with proper value
            //User body = null; // TODO: replace null with proper value
            //instance.UpdateUser(username, body);
            
        }
        
    }

}
