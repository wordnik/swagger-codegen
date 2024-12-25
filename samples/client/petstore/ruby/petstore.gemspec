# -*- encoding: utf-8 -*-

=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.42-SNAPSHOT

=end

$:.push File.expand_path("../lib", __FILE__)
require "petstore/version"

Gem::Specification.new do |s|
  s.name        = "petstore"
  s.version     = Petstore::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["Swagger-Codegen"]
  s.email       = ["apiteam@swagger.io"]
  s.homepage    = "https://github.com/swagger-api/swagger-codegen"
  s.summary     = "Swagger Petstore Ruby Gem"
  s.description = "This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\"
  s.license     = "Unlicense"
  s.required_ruby_version = ">= 1.9"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'
  s.add_runtime_dependency 'json', '~> 2.1', '>= 2.1.0'
  s.add_runtime_dependency 'addressable', '~> 2.3', '>= 2.3.0'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'
  s.add_development_dependency 'vcr', '~> 3.0', '>= 3.0.1'
  s.add_development_dependency 'webmock', '~> 1.24', '>= 1.24.3'
  s.add_development_dependency 'autotest', '~> 4.4', '>= 4.4.6'
  s.add_development_dependency 'autotest-rails-pure', '~> 4.1', '>= 4.1.2'
  s.add_development_dependency 'autotest-growl', '~> 0.2', '>= 0.2.16'
  s.add_development_dependency 'autotest-fsevent', '~> 0.2', '>= 0.2.12'

  gemspec = File.basename(__FILE__)
  spec.files = IO.popen(%w[find * -print0], chdir: __dir__, err: IO::NULL) do |ls|
    ls.readlines("\x0", chomp: true).reject do |f|
      (f == gemspec) ||
        f.start_with?(*%w[bin/ test/ spec/ features/ .git Gemfile]) ||
        f.end_with?(".gem")
    end
  end
  s.executables   = []
  s.require_paths = ["lib"]
end
