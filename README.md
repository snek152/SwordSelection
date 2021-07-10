# Sword Selection - A Minecraft mod for Forge
This all-new Minecraft mod adds in new medieval-inspired sword variations. Over time, many swords have popped up over the years, coming in new builds and forms. Sword Selection aims to add many of these famous and popular sword variations into Minecraft with some special twists. You can find the changelog and full list of features below.

# Features

### Sickles

<img src="https://i.ibb.co/7rb5wMX/woodsickles.png" width="16%" alt="wooden sickles"></img>
<img src="https://i.ibb.co/3v0Hf0c/stonesickles.png" width="16%" alt="stone sickles"></img>
<img src="https://i.ibb.co/9v0ybjK/ironsickles.png" width="16%" alt="iron sickles"></img>
<img src="https://i.ibb.co/ph2rRbd/goldsickles.png" width="16%" alt="golden sickles"></img>
<img src="https://i.ibb.co/dPYSmQY/diamondsickles.png" width="16%" alt="diamond sickles"></img>
<img src="https://i.ibb.co/PWC8gk1/netheritesickles.png" width="16%" alt="netherite sickles"></img>

Originating in the Neolithic Era, this special harvesting tool was also considered as a weapon because of its unique hook properties. In the Sword Selection mod, they are slightly faster than the average sword but do a little less damage in exchange. It can be used as a replacement for a hoe and can harvest crops too. The iron tier deals 3 damage with 3 attack speed and the stone tier deals 2 damage with 2.8 attack speed. Can be dual wielded.

### Broadsword

<img src="https://i.ibb.co/xjjWdkf/woodbroadsword.png" width="16%" alt="wooden broadsword"></img>
<img src="https://i.ibb.co/TryQwbN/stonebroadsword.png" width="16%" alt="stone broadsword"></img>
<img src="https://i.ibb.co/19jzYTF/ironbroadsword.png" width="16%" alt="iron broadsword"></img>
<img src="https://i.ibb.co/6YMmhTC/goldbroadsword.png" width="16%" alt="golden broadsword"></img>
<img src="https://i.ibb.co/5WcZ66y/diamondbroadsword.png" width="16%" alt="diamond broadsword"></img>
<img src="https://i.ibb.co/k8k26Ny/netheritebroadsword.png" width="16%" alt="netherite broadsword"></img>

These bulky swords first came into use during the Medieval Ages as a double edged, sharper sword than its predecessors. As part of Sword Selection, they are a hefty weight to hold, due to their immense width and power. With the iron tier dealing a massive 8 damage for 0.7 attack speed and the stone tier dealing 7 damage for 0.6 attack speed, this sword is extremely powerful and has the power to send your enemies reeling with increased knockback.

### Longsword

<img src="https://i.ibb.co/F3K6j2y/woodlongsword.png" width="16%" alt="wooden longsword"></img>
<img src="https://i.ibb.co/c8GsfT2/stonelongsword.png" width="16%" alt="stone longsword"></img>
<img src="https://i.ibb.co/kBy5yCn/ironlongsword.png" width="16%" alt="iron longsword"></img>
<img src="https://i.ibb.co/jWhpQnz/goldlongsword.png" width="16%" alt="golden longsword"></img>
<img src="https://i.ibb.co/qMdFrhv/diamondlongsword.png" width="16%" alt="diamond longsword"></img>
<img src="https://i.ibb.co/99j5Czy/netheritelongsword.png" width="16%" alt="netherite longsword"></img>


The longsword is a slightly flimsy and thin sword that came into existence during the Renaissance period in Europe. It was widely used in dueling, especially in the Viking era. Today, the longsword holds a special place in the Sword Selection mod. It is slightly thinner than the basic sword and is similar in terms of combat, with the iron tier dealing 6 damage for 1.8 attack speed and the stone tier dealing 5 damage for 1.6 attack speed. However, it has special properties. When striking a mob, it will also deal damage to mobs within a certain radius around it. 

### Crafting
As of version 0.4.1, you can input an iron or stone sword into a stonecutter to get their respective variations. However, a future feature may include a custom tile entity that can craft the different variations.

![Stonecutter example](https://i.ibb.co/VSbJGhD/Sword-Selection-Stonecutter-GUI.png)

# Changelog
Here is the changelog for the recent patches/updates to the mod.

## 0.4.1 (Snapshot/Beta)

Gameplay changes:
- The longsword's lightning properties have been removed. Instead, it attacks entities in a certain radius of the targeted entity.
- In order to balance this new change, the damage of the longsword has been decreased to 6 for iron and 5 for stone

Technical changes:
- Skeleton config files and builders are now implemented. They are however very basic and minimal. Currently, the only thing that can be adjusted is the damage of iron sickles, but it could crash the game with a negative damage. Until the next update, it's probably best not to mess with the files right now.

## 0.4.0 (Snapshot/Beta)

Gameplay changes:
- Dual wielding is now functional. Equip any tier of sickles in the offhand and another in the mainhand to fight like a boss
- NOTE: the above only works when a sickle is in both the main hand and offhand, otherwise it would be too overpowered


## 0.3.1 (Snapshot/Beta)

Gameplay changes:
- Dual wielding has been added for sickles, but it is not yet functional and is purely cosmetic, meaning it won't do any extra damage.
- You can also right click the sickles to create an attack animation that doesn't do any damage. This is a WIP

## 0.3.0 (Snapshot/Beta)
Gameplay changes:
- Added the stone tiers of the sickles, longsword, and broadsword, as well as model and texture files and recipes

Technical changes:
- Revamped version system in build.gradle, made it more efficient for getting the mod version

## 0.2.0 (Snapshot/Beta)
Added the Iron longsword and model, recipe, and texture files

## 0.1.1 (Snapshot/Beta)
Added iron sickles, iron broadswords, and stonecutter recipes for both


## Future Plans
Currently, I am focusing on adding new tiers of the existing sword variations. Iron and stone have already been completed, but there will be a wood, diamond, and netherite tier of each variation as well. 

Not only that, but there are plans for more variations to come in future updates. These include:
- Throwable daggers/knives
- Scythe
- Glaive
- Hammer
- Gauntlets (gloves that give more damage)
- Whip
- 

In addition to more variations, here are some more plans for miscellaneous things that may be added into the mod in the future (in order of likelyness from most likely to least likely):
- Config files to control each sword's attack damage and speed, as well as enable and disable variations and features
- Custom tile entity that can craft and uncraft each sword variation
- Dual wielding for the scimitars and sickles, and other variations that may need it


# Technical Info
Sword Selection is built using Minecraft Forge version 36.1.0 and MCP for Minecraft 1.16.5. It is licensed under the MIT license. You can feel free to use this mod in a modpack as long as you credit me as the author.

As for future versions, I am planning to port this mod to 1.17 once Forge has released for it. 
A Fabric version is most likely not going to happen anytime soon, however it is a possibility. Feel free to port this mod to Fabric if you want to.

NOTE: This mod is a work in progress (WIP). This means that not all features are in the game yet. It is still in beta and features are being added continually. If you would like to help in the development of this mod, you can message me on CurseForge. 

# Using Sword Selection
If you want to run this mod in Minecraft, you have a few options. The best and most reliable way to access my mod is through CurseForge. Click the link in the About section of this repo to be redirected to my mod page on CurseForge. There, you can access my compiled builds as they release. 

If for some reason CurseForge doesn't work for you or you don't prefer to use it, I also post compiled builds in the releases tab of this repo. You can find the JAR download there as well.

Finally, you can build the mod yourself using the source code. However, this is NOT RECOMMENDED for people who don't have prior knowledge about computers. To do this, you can download the zip file from the home page. Or, you can clone the repository using the following command:
`git clone https://github.com/SneK152/SwordSelection.git`

Next, you want to make sure you have the Java 8 JDK installed, or else you may not be able to compile the build and it will throw an error. You can find JDK builds at [AdoptOpenJDK](https://adoptopenjdk.net). 

Open your OS terminal and cd into the project folder. You should be in the folder with the gradle files and the src folder. Use `gradlew build` for Windows or `./gradlew build` for MacOS/Linux to build the project. It will run for some time, then output the JAR file in build/libs. Drag and drop that into your mod folder and you're good to go!
