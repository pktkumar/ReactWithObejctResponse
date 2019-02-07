import Profile from '../models/Profile'

/**
 * This function is used to make the call to the backend Inquiry service.
 * @method  fetchSkuDetails
 * @param  {string}
 * @returns  {response object}
 */
export function fetchSkuDetails(searchNbr, PARAMS) {
    console.time('fetchSkuDetails');

     //const profile = new Profile();
     const storeNbr = Profile.getStoreNumber();
     const domain = Profile.getDomain();
     const testEnv = Profile.getTestEnv();

     console.log("PARAMS = " + PARAMS);

     // Building URL
    // const url = domain + "/skuInquiry?storeNbr=" + storeNbr + "&searchInput=" + searchNbr;
     const url = "http://localhost:8080" + "/skuInquiry?storeNbr=" + storeNbr + "&searchInput=" + searchNbr;
     if(PARAMS) {
         "&productDetails=" + PARAMS.skuBasicInfoBySkuStore +
         "&onHands=" + PARAMS.skuOnHandsInfoByStore +
         "&skuLocations=" + PARAMS.skuLocationInfoByStore;
     }

    // const url = domain + "/skuInquiry?storeNbr=" + storeNbr + "&skuNbr=" + skuNbr;


    return fetch(url, {
        headers: {
            'Content-Type': 'application/json',
            'clientProfile': '{\'clientId\': \'storeim\', \'userId\': \'USER\', \'testEnvEnabled\': \'' + testEnv + '\'}'
        }
    })
    .then(response => {
        // Scroll to Top of the page
        window.scroll(0, 0);
        //--------------------------------
        console.timeEnd('fetchSkuDetails');
        console.log("***JSON = " + JSON.stringify(response));
        return response.json();
    })
    .then(json => {

        return json
    })
    .catch((error) => {
        console.log("ERROR: " + error);
        throw new Error(error)
    });

    //If the json has inner objects with error response make one more fetch call
    // but return json we currently have


}
