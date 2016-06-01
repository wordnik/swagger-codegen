#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

#import "SWGCategoryManagedObjectBuilder.h"
#import "SWGTagManagedObjectBuilder.h"

#import "SWGPetManagedObject.h"
#import "SWGPet.h"

/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@wordnik.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

@interface SWGPetManagedObjectBuilder : NSObject

@property (nonatomic, strong) SWGCategoryManagedObjectBuilder * categoryBuilder;
@property (nonatomic, strong) SWGTagManagedObjectBuilder * tagsBuilder;


-(SWGPetManagedObject*)createNewSWGPetManagedObjectInContext:(NSManagedObjectContext*)context;

-(SWGPetManagedObject*)SWGPetManagedObjectFromSWGPet:(SWGPet*)Pet context:(NSManagedObjectContext*)context;

-(void)updateSWGPetManagedObject:(SWGPetManagedObject*)Pet withSWGPet:(SWGPet*)Pet2;

-(SWGPet*)SWGPetFromSWGPetManagedObject:(SWGPetManagedObject*)obj;

-(void)updateSWGPet:(SWGPet*)Pet withSWGPetManagedObject:(SWGPetManagedObject*)Pet2;

@end
