# GameModeControl

A powerful lightweight plugin that helps you organizing game modes on your server.

## Are you using GameModeControl?

... then I would appreciate it, when you send me some feedback (in form of a pm or in the comments).

**Download GameModeControl for all your servers:** for 1.7 and below: **_Beta 1.0_**; for 1.8 and above use **_the newest version._**  
 I'm not going to make a bug-free version for 1.7 servers, because there are too few servers that do NOT run on 1.8.

Current development stage: BETA 1.3.1

## Commands

**Help**:  

*   <> = required
*   [] = optional
*   1 | 2 = 1 or 2, but not both
*   gmc.<_permission_> = permission to change your own and the gamemode of other players
*   gmc.<_permission_>.self = you are only allowed to change your own gamemode
*   gmc.<_permission_>.others = you have the permission to change the gamemode of other players

<table>

<tbody>

<tr>

<td>

Command

</td>

<td>

Function

</td>

<td>

Permission

</td>

</tr>

<tr>

<td>/gm &lt;id&gt; [player]<br>/gamemode* &lt;id&gt; [player]</td>

<td>Change the gamemode of a <br>player to the specified one</td>

<td>gmc.gamemode[.self | .others]</td>

</tr>

<tr>

<td colspan="3">&mdash; valid values for _id_: 0, 1, 2, 3, survival, creative, adventure, spectator</td>

</tr>

<tr>

<td>/gm0 [player]<br>/survival [player]</td>

<td>Change the gamemode of a <br>player to survival</td>

<td>gmc.survival[.self | .others]</td>

</tr>

<tr>

<td>/gm1 [player]<br>/creative [player]</td>

<td>Change the gamemode of a <br>player to creative</td>

<td>gmc.creative[.self | .others]</td>

</tr>

<tr>

<td>/gm2 [player]<br>/adventure [player]</td>

<td>Change the gamemode of a <br>player to adventure</td>

<td>gmc.adventure[.self | .others]</td>

</tr>

<tr>

<td>/gm3 [player]<br>/spectator [player]</td>

<td>Change the gamemode of a <br>player to spectator</td>

<td>gmc.spectator[.self | .others]</td>

</tr>

<tr>

<td>/gmh [page | command]</td>

<td>Show all commands for GMC or <br>help for a specific command</td>

<td>gmc.gmh</td>

</tr>

<tr>

<td>/gmi</td>

<td>Shows information about GMC, <br>such as the version</td>

<td>gmc.gmi</td>

</tr>

<tr>

<td>/gmr</td>

<td>Reloads the whole server in <br>order to reload the config of GMC</td>

<td>gmc.gmr</td>

</tr>

</tbody>

</table>

<small>* overrides the standard '/gamemode' from mojang; you can still use /mojang:gamemode for the "normal" /gamemode command.</small>

## Installation

1.  Copy the file you have <a>download</a>ed into your "plugins"-folder
2.  Restart your server, then stop it
3.  Edit the 'config.yml' and set the messages you want
4.  Start your server and enjoy

## Configuration

If you want to reset the config, just delete the 'config.yml' file (in &lt;your server folder&gt;/plugins/GMC/). GMC will generate it on server startup.

### Formatting codes

Please visit: [minecraft.gamepedia.com/Formatting_codes](http://minecraft.gamepedia.com/Formatting_codes)

### Aliases

<table>

<tbody>

<tr>

<td>

Alias

</td>

<td>

Description

</td>

<td>

Example

</td>

</tr>

<tr>

<td>$player</td>

<td>will be replaced with the specified player</td>

<td>&cCould not find this player: &7$player</td>

</tr>

<tr>

<td>$gm</td>

<td>will be replaced with the game mode, that has not been found</td>

<td>&cCould not find this gamemode: &7$gm</td>

</tr>

</tbody>

</table>

### Settings

*   **force-gamemode**:  
     _enable_ this feature to change the game mode of every player with the permission _gmc.forcegm_ that joins your server to the specified _game mode_.

## Source code

You can find the source code here on github.com: [github.com/MCMainiac/GameModeControl](https://github.com/MCMainiac/GameModeControl)  

## ToDo list

*   A function which allows players to change their gamemode only once
*   A function which allows changing the gamemode temporary (e.g. until the player leaves the server)
*   Please send me a [pm](http://dev.bukkit.org/home/send-private-message/?to=MCMainiac), post a comment or use the [github issues system](https://github.com/MCMainiac/GameModeControl/issues) and add the label 'enhancement' to it to suggest a feature

## Bugs

There are no bugs at the moment :) (at least noone reported one).  
 If you want to report a bug, please use the [github issues system](https://github.com/MCMainiac/GameModeControl/issues).
