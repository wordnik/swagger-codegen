require 'spec_helper'

describe "Pet" do
  before do
    Swagger.configure do |config|
      config.api_key = 'special-key' 
      config.host = 'petstore.swagger.io'
      config.base_path = '/v2'
    end
  end
  
  describe "pet methods" do
    it "should fetch a pet object" do
<<<<<<< HEAD
      pet = PetApi.getPetById(5)
      pet.should be_a(Pet)
      pet.id.should == 5
      pet.name.should == "panda"
=======
      pet = PetApi.get_pet_by_id(10002)
      pet.id.should == 10002 
      pet.name.should == "RUBY UNIT TESTING"
>>>>>>> update method naming convention for csharp, ruby, python, fix rspec for
    end

    it "should find pets by status" do
      pets = PetApi.find_pets_by_status('available')
      pets.length.should >= 3
    end
    
    it "should not find a pet with invalid status" do
<<<<<<< HEAD
      pets = PetApi.findPetsByStatus('invalid-status')
=======
      pets = PetApi.find_pets_by_status('invalid_status123')
>>>>>>> update method naming convention for csharp, ruby, python, fix rspec for
      pets.length.should == 0
    end

    it "should find a pet by status" do
      pets = PetApi.find_pets_by_status("available,sold")
      pets.map {|pet| 
        if(pet.status != 'available' && pet.status != 'sold') 
          raise "pet status wasn't right"
        end
      }
    end
    
    it "should update a pet" do
      pet = Pet.new({'id' => 99, 'name' => 'programmer', 'status' => 'coding'})
      PetApi.add_pet(pet)
      
      fetched = PetApi.get_pet_by_id(99)
      fetched.id.should == 99
    end

    it "should create a pet" do 
      pet = Pet.new('id' => 10002, 'name' => "RUBY UNIT TESTING")
      #raise pet.inspect
      PetApi.add_pet(pet)

      pet = PetApi.get_pet_by_id(10002)
      pet.id.should == 10002
      pet.name.should == "RUBY UNIT TESTING"
    end
  end
end

