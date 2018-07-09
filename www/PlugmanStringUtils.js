var exec = require('cordova/exec');

modules.exports.isBlank = function (input, success, error) {
    exec(success, error, 'PlugmanStringUtils', 'isBlank', [input]);
};

modules.exports.isEmpty = function (input, success, error) {
    exec(success, error, 'PlugmanStringUtils', 'isEmpty', [input]);
};
