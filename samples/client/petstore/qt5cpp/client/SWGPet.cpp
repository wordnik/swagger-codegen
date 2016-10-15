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


#include "SWGPet.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGPet::SWGPet(QString* json) {
    init();
    this->fromJson(*json);
}

SWGPet::SWGPet() {
    init();
}

SWGPet::~SWGPet() {
    this->cleanup();
}

void
SWGPet::init() {
    id = 0L;
category = new SWGCategory();
name = new QString("");
photo_urls = new QList<QString*>();
tags = new QList<SWGTag*>();
status = new QString("");
}

void
SWGPet::cleanup() {
    
if(category != NULL) {
        delete category;
    }
if(name != NULL) {
        delete name;
    }
if(photo_urls != NULL) {
        QList<QString*>* arr = photo_urls;
        foreach(QString* o, *arr) {
            delete o;
        }
        delete photo_urls;
    }
if(tags != NULL) {
        QList<SWGTag*>* arr = tags;
        foreach(SWGTag* o, *arr) {
            delete o;
        }
        delete tags;
    }
if(status != NULL) {
        delete status;
    }
}

SWGPet*
SWGPet::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGPet::fromJsonObject(QJsonObject &pJson) {
    setValue(&id, pJson["id"], "qint64", "");
setValue(&category, pJson["category"], "SWGCategory", "SWGCategory");
setValue(&name, pJson["name"], "QString", "QString");
setValue(&photo_urls, pJson["photo_urls"], "QList", "QString");
setValue(&tags, pJson["tags"], "QList", "SWGTag");
setValue(&status, pJson["status"], "QString", "QString");
}

QString
SWGPet::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGPet::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("id", QJsonValue(id));

    
    toJsonValue(QString("category"), category, obj, QString("SWGCategory"));
    
        

    
    toJsonValue(QString("name"), name, obj, QString("QString"));
    
        

    
    QList<QString*>* photo_urlsList = photo_urls;
    QJsonArray photo_urlsJsonArray;
    toJsonArray((QList<void*>*)photo_urls, &photo_urlsJsonArray, "photo_urls", "QString");

    obj->insert("photo_urls", photo_urlsJsonArray);
    

    
    QList<SWGTag*>* tagsList = tags;
    QJsonArray tagsJsonArray;
    toJsonArray((QList<void*>*)tags, &tagsJsonArray, "tags", "SWGTag");

    obj->insert("tags", tagsJsonArray);
    

    
    toJsonValue(QString("status"), status, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGPet::getId() {
    return id;
}
void
SWGPet::setId(qint64 id) {
    this->id = id;
}

SWGCategory*
SWGPet::getCategory() {
    return category;
}
void
SWGPet::setCategory(SWGCategory* category) {
    this->category = category;
}

QString*
SWGPet::getName() {
    return name;
}
void
SWGPet::setName(QString* name) {
    this->name = name;
}

QList<QString*>*
SWGPet::getPhotoUrls() {
    return photo_urls;
}
void
SWGPet::setPhotoUrls(QList<QString*>* photo_urls) {
    this->photo_urls = photo_urls;
}

QList<SWGTag*>*
SWGPet::getTags() {
    return tags;
}
void
SWGPet::setTags(QList<SWGTag*>* tags) {
    this->tags = tags;
}

QString*
SWGPet::getStatus() {
    return status;
}
void
SWGPet::setStatus(QString* status) {
    this->status = status;
}



} /* namespace Swagger */

