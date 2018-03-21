import Dictionary from "lodash";

class HttpResponse<T = any> {
    constructor(public response: T, public status:number, public headers?:Dictionary<string>) {

    }
}

export default HttpResponse