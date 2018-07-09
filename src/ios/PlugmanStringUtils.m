/********* PlugmanStringUtils.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>
#import "IOSStringUtils"

@interface PlugmanStringUtils : CDVPlugin {
  // Member variables go here.
}

- (void) coolMethod: (CDVInvokedUrlCommand *) command;
- (void) isBlank: (CDVInvokedUrlCommand *) command;
- (void) isEmpty: (CDVInvokedUrlCommand *) command;
@end

@implementation PlugmanStringUtils

- (void) coolMethod: (CDVInvokedUrlCommand *) command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];

    if (echo != nil && [echo length] > 0) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:echo];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void) isBlank: (CDVInvokedUrlCommand *) command
{
    CDVPluginResult* pluginResult = nil;
    NSString* input = [command.arguments objectAtIndex:0];
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:[isBlank input]];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void) isEmpty: (CDVInvokedUrlCommand *) command
{
    CDVPluginResult* pluginResult = nil;
    NSString* input = [command.arguments objectAtIndex:0];
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:[isEmpty input]];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
