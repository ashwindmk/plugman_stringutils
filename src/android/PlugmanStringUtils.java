package cordova.plugin.stringutils;

import java.util.Locale;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import com.sun.glass.ui.MenuItem.Callback;

import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ashwin.libraries.com.androidstringutils.StringUtils;

public class PlugmanStringUtils extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("test")) {
            String result = Locale.getDefault().getCountry();
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
            return true;
        }
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
            callbackContext.success(String.valueOf(StringUtils.isBlank(input)));
        } catch (Exception e) {
            callbackContext.error("Exception occured: " + e);
        }
    }

    private void isEmpty(String input, CallbackContext callbackContext) {
        try {
            callbackContext.success(String.valueOf(StringUtils.isEmpty(input)));
        } catch (Exception e) {
            callbackContext.error("Exception occured: " + e);
        }
    }
}

