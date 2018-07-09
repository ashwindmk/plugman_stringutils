package plugman.stringutils;

import android.util.Log;

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
            String input = args.getJSONObject(0).getString("input");
            this.isBlank(input, callbackContext);
            return true;
        }
        if (action.equals("isEmpty")) {
            String input = args.getJSONObject(0).getString("input");
            this.isEmpty(input, callbackContext);
            return true;
        }
        return false;
    }

    private void isBlank(String input, CallbackContext callbackContext) {
        try {
            Log.d("debug-logging", "checking if '" + input + "' is blank");
            JSONObject result = new JSONObject();
            result.put("result", StringUtils.isBlank(input));
            callbackContext.success(result);
        } catch (Exception e) {
            Log.e("debug-logging", "isEmpty() > exception: " + e, e);
            callbackContext.error("Exception occured: " + e);
        }
    }

    private void isEmpty(String input, CallbackContext callbackContext) {
        try {
            Log.d("debug-logging", "checking if '" + input + "' is empty");
            JSONObject result = new JSONObject();
            result.put("result", StringUtils.isEmpty(input));
            callbackContext.success(result);
        } catch (Exception e) {
            Log.e("debug-logging", "isEmpty() > exception: " + e, e);
            callbackContext.error("Exception occured: " + e);
        }
    }
}
