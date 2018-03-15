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

#include "SWGUserApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGUserApi::SWGUserApi() {}

SWGUserApi::~SWGUserApi() {}

SWGUserApi::SWGUserApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGUserApi::createUser(SWGUser& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    
    QString output = body.asJson();
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::createUserCallback);

    worker->execute(&input);
}

void
SWGUserApi::createUserCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createUserSignal();
    } else {
        emit createUserSignalE(error_type, error_str);
        emit createUserSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::createUsersWithArrayInput(QList<SWGUser*>*& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/createWithArray");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    QJsonObject body_jobj;
    toJsonArray((QList<void*>*)body, body_jobj, QString("body"), QString("SWGUser*"));

    QJsonDocument doc(body_jobj);
    QByteArray bytes = doc.toJson();

    input.request_body.append(bytes);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::createUsersWithArrayInputCallback);

    worker->execute(&input);
}

void
SWGUserApi::createUsersWithArrayInputCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createUsersWithArrayInputSignal();
    } else {
        emit createUsersWithArrayInputSignalE(error_type, error_str);
        emit createUsersWithArrayInputSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::createUsersWithListInput(QList<SWGUser*>*& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/createWithList");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    QJsonObject body_jobj;
    toJsonArray((QList<void*>*)body, body_jobj, QString("body"), QString("SWGUser*"));

    QJsonDocument doc(body_jobj);
    QByteArray bytes = doc.toJson();

    input.request_body.append(bytes);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::createUsersWithListInputCallback);

    worker->execute(&input);
}

void
SWGUserApi::createUsersWithListInputCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createUsersWithListInputSignal();
    } else {
        emit createUsersWithListInputSignalE(error_type, error_str);
        emit createUsersWithListInputSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::deleteUser(QString* username) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/{username}");

    QString usernamePathParam("{"); usernamePathParam.append("username").append("}");
    fullPath.replace(usernamePathParam, stringValue(username));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "DELETE");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::deleteUserCallback);

    worker->execute(&input);
}

void
SWGUserApi::deleteUserCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit deleteUserSignal();
    } else {
        emit deleteUserSignalE(error_type, error_str);
        emit deleteUserSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::getUserByName(QString* username) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/{username}");

    QString usernamePathParam("{"); usernamePathParam.append("username").append("}");
    fullPath.replace(usernamePathParam, stringValue(username));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::getUserByNameCallback);

    worker->execute(&input);
}

void
SWGUserApi::getUserByNameCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    SWGUser* output = static_cast<SWGUser*>(create(json, QString("SWGUser")));
    auto wrapper = new QObjectWrapper<SWGUser*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getUserByNameSignal(output);
    } else {
        emit getUserByNameSignalE(output, error_type, error_str);
        emit getUserByNameSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::loginUser(QString* username, QString* password) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/login");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("username"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(username)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("password"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(password)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::loginUserCallback);

    worker->execute(&input);
}

void
SWGUserApi::loginUserCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    QString* output = static_cast<QString*>(create(json, QString("QString")));
    auto wrapper = new QObjectWrapper<QString*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit loginUserSignal(output);
    } else {
        emit loginUserSignalE(output, error_type, error_str);
        emit loginUserSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::logoutUser() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/logout");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::logoutUserCallback);

    worker->execute(&input);
}

void
SWGUserApi::logoutUserCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit logoutUserSignal();
    } else {
        emit logoutUserSignalE(error_type, error_str);
        emit logoutUserSignalEFull(worker, error_type, error_str);
    }
}

void
SWGUserApi::updateUser(QString* username, SWGUser& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/{username}");

    QString usernamePathParam("{"); usernamePathParam.append("username").append("}");
    fullPath.replace(usernamePathParam, stringValue(username));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "PUT");


    
    QString output = body.asJson();
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGUserApi::updateUserCallback);

    worker->execute(&input);
}

void
SWGUserApi::updateUserCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit updateUserSignal();
    } else {
        emit updateUserSignalE(error_type, error_str);
        emit updateUserSignalEFull(worker, error_type, error_str);
    }
}


}
