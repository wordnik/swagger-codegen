/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

#ifndef _SWG_SWGPetApi_H_
#define _SWG_SWGPetApi_H_

#include "SWGHttpRequest.h"

#include "ApiResponse.h"
#include "Pet.h"
#include <QString>
#include "SWGApiResponse.h"
#include "SWGHttpRequest.h"

#include <QObject>

namespace Swagger {

class SWGPetApi: public QObject {
    Q_OBJECT

public:
    SWGPetApi();
    SWGPetApi(QString host, QString basePath);
    ~SWGPetApi();

    QString host;
    QString basePath;

    void addPet(Pet body);
    void deletePet(qint64 pet_id, QString* api_key);
    void findPetsByStatus(QList<QString*>* status);
    void findPetsByTags(QList<QString*>* tags);
    void getPetById(qint64 pet_id);
<<<<<<< HEAD
    void updatePet(Pet body);
=======
    void updatePet(SWGPet body);
>>>>>>> origin/master
    void updatePetWithForm(qint64 pet_id, QString* name, QString* status);
    void uploadFile(qint64 pet_id, QString* additional_metadata, SWGHttpRequestInputFileElement* file);
    
private:
    void addPetCallback (HttpRequestWorker * worker);
    void deletePetCallback (HttpRequestWorker * worker);
    void findPetsByStatusCallback (HttpRequestWorker * worker);
    void findPetsByTagsCallback (HttpRequestWorker * worker);
    void getPetByIdCallback (HttpRequestWorker * worker);
    void updatePetCallback (HttpRequestWorker * worker);
    void updatePetWithFormCallback (HttpRequestWorker * worker);
    void uploadFileCallback (HttpRequestWorker * worker);
    
signals:
    void addPetSignal();
    void deletePetSignal();
    void findPetsByStatusSignal(QList<Pet*>* summary);
    void findPetsByTagsSignal(QList<Pet*>* summary);
    void getPetByIdSignal(Pet* summary);
    void updatePetSignal();
    void updatePetWithFormSignal();
<<<<<<< HEAD
    void uploadFileSignal(ApiResponse* summary);
=======
    void uploadFileSignal(SWGApiResponse* summary);
>>>>>>> origin/master
    
};

}
#endif
