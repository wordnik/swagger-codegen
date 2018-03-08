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

/*
 * SWGCategory.h
 *
 * A category for a pet
 */

#ifndef SWGCategory_H_
#define SWGCategory_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGCategory: public SWGObject {
public:
    SWGCategory();
    SWGCategory(QString json);
    ~SWGCategory();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject asJsonObject();
    void fromJsonObject(QJsonObject json);
    SWGCategory* fromJson(QString jsonString);

    qint64 getId();
    void setId(qint64 id);

    QString* getName();
    void setName(QString* name);


    virtual bool isSet() override;

private:
    qint64 id;
    bool m_id_isSet;

    QString* name;
    bool m_name_isSet;

};

}

#endif /* SWGCategory_H_ */
