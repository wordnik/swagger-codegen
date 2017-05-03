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
package WWW::SwaggerClient::FakeApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::SwaggerClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::SwaggerClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# test_client_model
#
# To test \"client\" model
# 
# @param Client $body client model (required)
{
    my $params = {
    'body' => {
        data_type => 'Client',
        description => 'client model',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'test_client_model' } = { 
    	summary => 'To test \&quot;client\&quot; model',
        params => $params,
        returns => 'Client',
        };
}
# @return Client
#
sub test_client_model {
    my ($self, %args) = @_;

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling test_client_model");
    }

    # parse inputs
    my $_resource_path = '/fake';

    my $_method = 'PATCH';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Client', $response);
    return $_response_object;
}

#
# test_endpoint_parameters
#
# Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
# 
# @param Number $number None (required)
# @param double $double None (required)
# @param string $pattern_without_delimiter None (required)
# @param string $byte None (required)
# @param int $integer None (optional)
# @param int $int32 None (optional)
# @param int $int64 None (optional)
# @param double $float None (optional)
# @param string $string None (optional)
# @param string $binary None (optional)
# @param DateTime $date None (optional)
# @param DateTime $date_time None (optional)
# @param string $password None (optional)
# @param string $callback None (optional)
{
    my $params = {
    'number' => {
        data_type => 'Number',
        description => 'None',
        required => '1',
    },
    'double' => {
        data_type => 'double',
        description => 'None',
        required => '1',
    },
    'pattern_without_delimiter' => {
        data_type => 'string',
        description => 'None',
        required => '1',
    },
    'byte' => {
        data_type => 'string',
        description => 'None',
        required => '1',
    },
    'integer' => {
        data_type => 'int',
        description => 'None',
        required => '0',
    },
    'int32' => {
        data_type => 'int',
        description => 'None',
        required => '0',
    },
    'int64' => {
        data_type => 'int',
        description => 'None',
        required => '0',
    },
    'float' => {
        data_type => 'double',
        description => 'None',
        required => '0',
    },
    'string' => {
        data_type => 'string',
        description => 'None',
        required => '0',
    },
    'binary' => {
        data_type => 'string',
        description => 'None',
        required => '0',
    },
    'date' => {
        data_type => 'DateTime',
        description => 'None',
        required => '0',
    },
    'date_time' => {
        data_type => 'DateTime',
        description => 'None',
        required => '0',
    },
    'password' => {
        data_type => 'string',
        description => 'None',
        required => '0',
    },
    'callback' => {
        data_type => 'string',
        description => 'None',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'test_endpoint_parameters' } = { 
    	summary => 'Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub test_endpoint_parameters {
    my ($self, %args) = @_;

    # verify the required parameter 'number' is set
    unless (exists $args{'number'}) {
      croak("Missing the required parameter 'number' when calling test_endpoint_parameters");
    }

    # verify the required parameter 'double' is set
    unless (exists $args{'double'}) {
      croak("Missing the required parameter 'double' when calling test_endpoint_parameters");
    }

    # verify the required parameter 'pattern_without_delimiter' is set
    unless (exists $args{'pattern_without_delimiter'}) {
      croak("Missing the required parameter 'pattern_without_delimiter' when calling test_endpoint_parameters");
    }

    # verify the required parameter 'byte' is set
    unless (exists $args{'byte'}) {
      croak("Missing the required parameter 'byte' when calling test_endpoint_parameters");
    }

    # parse inputs
    my $_resource_path = '/fake';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/xml; charset=utf-8', 'application/json; charset=utf-8');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/xml; charset=utf-8', 'application/json; charset=utf-8');

    # form params
    if ( exists $args{'integer'} ) {
                $form_params->{'integer'} = $self->{api_client}->to_form_value($args{'integer'});
    }
    
    # form params
    if ( exists $args{'int32'} ) {
                $form_params->{'int32'} = $self->{api_client}->to_form_value($args{'int32'});
    }
    
    # form params
    if ( exists $args{'int64'} ) {
                $form_params->{'int64'} = $self->{api_client}->to_form_value($args{'int64'});
    }
    
    # form params
    if ( exists $args{'number'} ) {
                $form_params->{'number'} = $self->{api_client}->to_form_value($args{'number'});
    }
    
    # form params
    if ( exists $args{'float'} ) {
                $form_params->{'float'} = $self->{api_client}->to_form_value($args{'float'});
    }
    
    # form params
    if ( exists $args{'double'} ) {
                $form_params->{'double'} = $self->{api_client}->to_form_value($args{'double'});
    }
    
    # form params
    if ( exists $args{'string'} ) {
                $form_params->{'string'} = $self->{api_client}->to_form_value($args{'string'});
    }
    
    # form params
    if ( exists $args{'pattern_without_delimiter'} ) {
                $form_params->{'pattern_without_delimiter'} = $self->{api_client}->to_form_value($args{'pattern_without_delimiter'});
    }
    
    # form params
    if ( exists $args{'byte'} ) {
                $form_params->{'byte'} = $self->{api_client}->to_form_value($args{'byte'});
    }
    
    # form params
    if ( exists $args{'binary'} ) {
                $form_params->{'binary'} = $self->{api_client}->to_form_value($args{'binary'});
    }
    
    # form params
    if ( exists $args{'date'} ) {
                $form_params->{'date'} = $self->{api_client}->to_form_value($args{'date'});
    }
    
    # form params
    if ( exists $args{'date_time'} ) {
                $form_params->{'dateTime'} = $self->{api_client}->to_form_value($args{'date_time'});
    }
    
    # form params
    if ( exists $args{'password'} ) {
                $form_params->{'password'} = $self->{api_client}->to_form_value($args{'password'});
    }
    
    # form params
    if ( exists $args{'callback'} ) {
                $form_params->{'callback'} = $self->{api_client}->to_form_value($args{'callback'});
    }
    
    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(http_basic_test )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# test_enum_parameters
#
# To test enum parameters
# 
# @param ARRAY[string] $enum_form_string_array Form parameter enum test (string array) (optional)
# @param string $enum_form_string Form parameter enum test (string) (optional, default to -efg)
# @param ARRAY[string] $enum_header_string_array Header parameter enum test (string array) (optional)
# @param string $enum_header_string Header parameter enum test (string) (optional, default to -efg)
# @param ARRAY[string] $enum_query_string_array Query parameter enum test (string array) (optional)
# @param string $enum_query_string Query parameter enum test (string) (optional, default to -efg)
# @param int $enum_query_integer Query parameter enum test (double) (optional)
# @param double $enum_query_double Query parameter enum test (double) (optional)
{
    my $params = {
    'enum_form_string_array' => {
        data_type => 'ARRAY[string]',
        description => 'Form parameter enum test (string array)',
        required => '0',
    },
    'enum_form_string' => {
        data_type => 'string',
        description => 'Form parameter enum test (string)',
        required => '0',
    },
    'enum_header_string_array' => {
        data_type => 'ARRAY[string]',
        description => 'Header parameter enum test (string array)',
        required => '0',
    },
    'enum_header_string' => {
        data_type => 'string',
        description => 'Header parameter enum test (string)',
        required => '0',
    },
    'enum_query_string_array' => {
        data_type => 'ARRAY[string]',
        description => 'Query parameter enum test (string array)',
        required => '0',
    },
    'enum_query_string' => {
        data_type => 'string',
        description => 'Query parameter enum test (string)',
        required => '0',
    },
    'enum_query_integer' => {
        data_type => 'int',
        description => 'Query parameter enum test (double)',
        required => '0',
    },
    'enum_query_double' => {
        data_type => 'double',
        description => 'Query parameter enum test (double)',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'test_enum_parameters' } = { 
    	summary => 'To test enum parameters',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub test_enum_parameters {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/fake';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('*/*');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('*/*');

    # query params
    if ( exists $args{'enum_query_string_array'}) {
        $query_params->{'enum_query_string_array'} = $self->{api_client}->to_query_value($args{'enum_query_string_array'});
    }

    # query params
    if ( exists $args{'enum_query_string'}) {
        $query_params->{'enum_query_string'} = $self->{api_client}->to_query_value($args{'enum_query_string'});
    }

    # query params
    if ( exists $args{'enum_query_integer'}) {
        $query_params->{'enum_query_integer'} = $self->{api_client}->to_query_value($args{'enum_query_integer'});
    }

    # header params
    if ( exists $args{'enum_header_string_array'}) {
        $header_params->{'enum_header_string_array'} = $self->{api_client}->to_header_value($args{'enum_header_string_array'});
    }

    # header params
    if ( exists $args{'enum_header_string'}) {
        $header_params->{'enum_header_string'} = $self->{api_client}->to_header_value($args{'enum_header_string'});
    }

    # form params
    if ( exists $args{'enum_form_string_array'} ) {
                $form_params->{'enum_form_string_array'} = $self->{api_client}->to_form_value($args{'enum_form_string_array'});
    }
    
    # form params
    if ( exists $args{'enum_form_string'} ) {
                $form_params->{'enum_form_string'} = $self->{api_client}->to_form_value($args{'enum_form_string'});
    }
    
    # form params
    if ( exists $args{'enum_query_double'} ) {
                $form_params->{'enum_query_double'} = $self->{api_client}->to_form_value($args{'enum_query_double'});
    }
    
    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;
