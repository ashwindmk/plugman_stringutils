// var exec = require('cordova/exec');

// modules.exports.test = function (success, error) {
//     exec(success, error, 'PlugmanStringUtils', 'test', []);
// }

// modules.exports.isBlank = function (input, success, error) {
//     exec(success, error, 'PlugmanStringUtils', 'isBlank', [input]);
// };

// modules.exports.isEmpty = function (input, success, error) {
//     exec(success, error, 'PlugmanStringUtils', 'isEmpty', [input]);
// };

var PlugmanStringUtils = function() {};

/*var CountryError = function(code, message) {
  this.code = code || null;
  this.message = message || '';
};*/

PlugmanStringUtils.prototype.test = function(success, error) {
  console.log("reached www/PlugmanStringUtils");
  cordova.exec(success, error, 'PlugmanStringUtils', 'test', []);
};

PlugmanStringUtils.prototype.isBlank = function(input, success, error) {
    cordova.exec(success, error, 'PlugmanStringUtils', 'isBlank', [input]);
};

PlugmanStringUtils.prototype.isEmpty = function(input, success, error) {
    cordova.exec(success, error, 'PlugmanStringUtils', 'isEmpty', [input]);
};

if (!window.plugins) {
  window.plugins = {};
}
if (!window.plugins.stringutils) {
  window.plugins.stringutils = new PlugmanStringUtils();
}

if (module.exports) {
  module.exports = PlugmanStringUtils;
}
