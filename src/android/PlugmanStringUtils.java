package plugman.stringutils;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ashwin.libraries.com.androidstringutils.StringUtils;

public class PlugmanStringUtils extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isBlank")) {
            String input = args.getString(0);
            this.isBlank(input, callbackContext);
            return true;
        }
        if (action.equals("isEmpty")) {
            String input = args.getString(0);
            this.isEmpty(input, callbackContext);
            return true;
        }
        return false;
    }

    private void isBlank(String input, CallbackContext callbackContext) {
        try {
            callbackContext.success(StringUtils.isBlank(input));
        } catch (Exception e) {
            callbackContext.error("Exception occured: " + e);
        }
    }

    private void isEmpty(String input, CallbackContext callbackContext) {
        try {
            callbackContext.success(StringUtils.isEmpty(input));
        } catch (Exception e) {
            callbackContext.error("Exception occured: " + e);
        }
    }
}
