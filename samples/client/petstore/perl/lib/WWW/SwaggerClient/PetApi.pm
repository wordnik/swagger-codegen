=begin comment

Swagger Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::PetApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;
use WWW::SwaggerClient::Configuration;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class   = shift;
    my (%self) = (
        'api_client' => WWW::SwaggerClient::ApiClient->instance,
        @_
    );

    #my $self = {
    #    #api_client => $options->{api_client}
    #    api_client => $default_api_client
    #}; 

    bless \%self, $class;

}


#
# add_pet
#
# Add a new pet to the store
# 
# @param Pet $body Pet object that needs to be added to the store (required)
{
    my $params = {
    'body' => {
        data_type => 'Pet',
        description => 'Pet object that needs to be added to the store',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'add_pet' } = { 
    	summary => 'Add a new pet to the store',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub add_pet {
    my ($self, %args) = @_;

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling add_pet");
    }

    # parse inputs
    my $_resource_path = '/pet';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json', 'application/xml');

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# delete_pet
#
# Deletes a pet
# 
# @param int $pet_id Pet id to delete (required)
# @param string $api_key  (optional)
{
    my $params = {
    'pet_id' => {
        data_type => 'int',
        description => 'Pet id to delete',
        required => '1',
    },
    'api_key' => {
        data_type => 'string',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_pet' } = { 
    	summary => 'Deletes a pet',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub delete_pet {
    my ($self, %args) = @_;

    # verify the required parameter 'pet_id' is set
    unless (exists $args{'pet_id'}) {
      croak("Missing the required parameter 'pet_id' when calling delete_pet");
    }

    # parse inputs
    my $_resource_path = '/pet/{petId}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # header params
    if ( exists $args{'api_key'}) {
        $header_params->{'api_key'} = $self->{api_client}->to_header_value($args{'api_key'});
    }

    # path params
    if ( exists $args{'pet_id'}) {
        my $_base_variable = "{" . "petId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'pet_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# find_pets_by_status
#
# Finds Pets by status
# 
# @param ARRAY[string] $status Status values that need to be considered for filter (required)
{
    my $params = {
    'status' => {
        data_type => 'ARRAY[string]',
        description => 'Status values that need to be considered for filter',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'find_pets_by_status' } = { 
    	summary => 'Finds Pets by status',
        params => $params,
        returns => 'ARRAY[Pet]',
        };
}
# @return ARRAY[Pet]
#
sub find_pets_by_status {
    my ($self, %args) = @_;

    # verify the required parameter 'status' is set
    unless (exists $args{'status'}) {
      croak("Missing the required parameter 'status' when calling find_pets_by_status");
    }

    # parse inputs
    my $_resource_path = '/pet/findByStatus';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'status'}) {
        $query_params->{'status'} = $self->{api_client}->to_query_value($args{'status'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Pet]', $response);
    return $_response_object;
}

#
# find_pets_by_tags
#
# Finds Pets by tags
# 
# @param ARRAY[string] $tags Tags to filter by (required)
{
    my $params = {
    'tags' => {
        data_type => 'ARRAY[string]',
        description => 'Tags to filter by',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'find_pets_by_tags' } = { 
    	summary => 'Finds Pets by tags',
        params => $params,
        returns => 'ARRAY[Pet]',
        };
}
# @return ARRAY[Pet]
#
sub find_pets_by_tags {
    my ($self, %args) = @_;

    # verify the required parameter 'tags' is set
    unless (exists $args{'tags'}) {
      croak("Missing the required parameter 'tags' when calling find_pets_by_tags");
    }

    # parse inputs
    my $_resource_path = '/pet/findByTags';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'tags'}) {
        $query_params->{'tags'} = $self->{api_client}->to_query_value($args{'tags'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Pet]', $response);
    return $_response_object;
}

#
# get_pet_by_id
#
# Find pet by ID
# 
# @param int $pet_id ID of pet to return (required)
{
    my $params = {
    'pet_id' => {
        data_type => 'int',
        description => 'ID of pet to return',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_pet_by_id' } = { 
    	summary => 'Find pet by ID',
        params => $params,
        returns => 'Pet',
        };
}
# @return Pet
#
sub get_pet_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'pet_id' is set
    unless (exists $args{'pet_id'}) {
      croak("Missing the required parameter 'pet_id' when calling get_pet_by_id");
    }

    # parse inputs
    my $_resource_path = '/pet/{petId}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # path params
    if ( exists $args{'pet_id'}) {
        my $_base_variable = "{" . "petId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'pet_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(api_key )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Pet', $response);
    return $_response_object;
}

#
# update_pet
#
# Update an existing pet
# 
# @param Pet $body Pet object that needs to be added to the store (required)
{
    my $params = {
    'body' => {
        data_type => 'Pet',
        description => 'Pet object that needs to be added to the store',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_pet' } = { 
    	summary => 'Update an existing pet',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_pet {
    my ($self, %args) = @_;

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling update_pet");
    }

    # parse inputs
    my $_resource_path = '/pet';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json', 'application/xml');

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# update_pet_with_form
#
# Updates a pet in the store with form data
# 
# @param int $pet_id ID of pet that needs to be updated (required)
# @param string $name Updated name of the pet (optional)
# @param string $status Updated status of the pet (optional)
{
    my $params = {
    'pet_id' => {
        data_type => 'int',
        description => 'ID of pet that needs to be updated',
        required => '1',
    },
    'name' => {
        data_type => 'string',
        description => 'Updated name of the pet',
        required => '0',
    },
    'status' => {
        data_type => 'string',
        description => 'Updated status of the pet',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_pet_with_form' } = { 
    	summary => 'Updates a pet in the store with form data',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_pet_with_form {
    my ($self, %args) = @_;

    # verify the required parameter 'pet_id' is set
    unless (exists $args{'pet_id'}) {
      croak("Missing the required parameter 'pet_id' when calling update_pet_with_form");
    }

    # parse inputs
    my $_resource_path = '/pet/{petId}';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml', 'application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/x-www-form-urlencoded');

    # path params
    if ( exists $args{'pet_id'}) {
        my $_base_variable = "{" . "petId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'pet_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # form params
    if ( exists $args{'name'} ) {
                $form_params->{'name'} = $self->{api_client}->to_form_value($args{'name'});
    }
    
    # form params
    if ( exists $args{'status'} ) {
                $form_params->{'status'} = $self->{api_client}->to_form_value($args{'status'});
    }
    
    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# upload_file
#
# uploads an image
# 
# @param int $pet_id ID of pet to update (required)
# @param string $additional_metadata Additional data to pass to server (optional)
# @param File $file file to upload (optional)
{
    my $params = {
    'pet_id' => {
        data_type => 'int',
        description => 'ID of pet to update',
        required => '1',
    },
    'additional_metadata' => {
        data_type => 'string',
        description => 'Additional data to pass to server',
        required => '0',
    },
    'file' => {
        data_type => 'File',
        description => 'file to upload',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'upload_file' } = { 
    	summary => 'uploads an image',
        params => $params,
        returns => 'ApiResponse',
        };
}
# @return ApiResponse
#
sub upload_file {
    my ($self, %args) = @_;

    # verify the required parameter 'pet_id' is set
    unless (exists $args{'pet_id'}) {
      croak("Missing the required parameter 'pet_id' when calling upload_file");
    }

    # parse inputs
    my $_resource_path = '/pet/{petId}/uploadImage';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('multipart/form-data');

    # path params
    if ( exists $args{'pet_id'}) {
        my $_base_variable = "{" . "petId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'pet_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # form params
    if ( exists $args{'additional_metadata'} ) {
                $form_params->{'additionalMetadata'} = $self->{api_client}->to_form_value($args{'additional_metadata'});
    }
    
    # form params
    if ( exists $args{'file'} ) {
        $form_params->{'file'} = [] unless defined $form_params->{'file'};
        push @{$form_params->{'file'}}, $args{'file'};
            }
    
    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(petstore_auth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ApiResponse', $response);
    return $_response_object;
}

1;
