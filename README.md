# [MovePlayerAfterLogin](https://www.spigotmc.org/resources/move-player-after-login.82873/)
A very simple plugin that changes the player's server after AuthMe login

## Introduction

This plugin, like the description says, after the login or the registration by AuthMe changes the player server by redirecting them there.

I'ts userful just in case AuthMe has problems with new versions or makes conflicts with other plugins..

## Installation

To install the plugin you just need to put the file in the plugins folder of the server where the authentication is performed (the same server as AuthMe).

## Configuration

When the plugin is first executed, in his folder, it generates a file called `config.yml` containing the configuration of the plugin. The content of the file should be as it follows:

```yaml
server_name: survival
```

To make your plugin work you just need to change the parameter `survival` with the name of the server where you want the players to be redirected after authentication.
