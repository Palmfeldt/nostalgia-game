package gg.rsmod.plugins.content.skills.fletching.whittling

import gg.rsmod.plugins.api.cfg.Items

enum class WhittleItem(val product: Int, val amount: Int = 1, val levelRequirement: Int, val experience: Double) {

    ARROW_SHAFT_15(product = Items.ARROW_SHAFT, amount = 15, levelRequirement = 1, experience = 5.0),
    SHORTBOW_U(product = Items.SHORTBOW_U, levelRequirement = 5, experience = 5.0),
    LONGBOW_U(product = Items.LONGBOW_U, levelRequirement = 10, experience = 10.0),
    WOODEN_STOCK(product = Items.WOODEN_STOCK, levelRequirement = 9, experience = 6.0),

    OAK_SHORTBOW_U(product = Items.OAK_SHORTBOW_U, levelRequirement = 20, experience = 16.5),
    OAK_LONGBOW_U(product = Items.OAK_LONGBOW_U, levelRequirement = 25, experience = 25.0),
    OAK_STOCK(product = Items.OAK_STOCK, levelRequirement = 24, experience = 16.0),

    OGRE_ARROW_SHAFT(product = Items.OGRE_ARROW_SHAFT, levelRequirement = 5, experience = 1.6),
    UNSTRUNG_COMP_BOW(product = Items.UNSTRUNG_COMP_BOW, levelRequirement = 30, experience = 45.0),

    WILLOW_SHORTBOW_U(product = Items.WILLOW_SHORTBOW_U, levelRequirement = 35, experience = 33.3),
    WILLOW_LONGBOW_U(product = Items.WILLOW_LONGBOW_U, levelRequirement = 40, experience = 41.5),
    WILLOW_STOCK(product = Items.WILLOW_STOCK, levelRequirement = 39, experience = 22.0),

    TEAK_STOCK(product = Items.TEAK_STOCK, levelRequirement = 46, experience = 27.0),

    MAPLE_SHORTBOW_U(product = Items.MAPLE_SHORTBOW_U, levelRequirement = 50, experience = 50.0),
    MAPLE_LONGBOW_U(product = Items.MAPLE_LONGBOW_U, levelRequirement = 55, experience = 58.3),
    MAPLE_STOCK(product = Items.MAPLE_STOCK, levelRequirement = 54, experience = 32.0),

    MAHOGANY_STOCK(product = Items.MAHOGANY_STOCK, levelRequirement = 61, experience = 41.0),

    YEW_SHORTBOW_U(product = Items.YEW_SHORTBOW_U, levelRequirement = 65, experience = 67.5),
    YEW_LONGBOW_U(product = Items.YEW_LONGBOW_U, levelRequirement = 70, experience = 75.0),
    YEW_STOCK(product = Items.YEW_STOCK, levelRequirement = 69, experience = 50.0),

    MAGIC_SHORTBOW_U(product = Items.MAGIC_SHORTBOW_U, levelRequirement = 80, experience = 83.3),
    MAGIC_LONGBOW_U(product = Items.MAGIC_LONGBOW_U, levelRequirement = 85, experience = 91.5),

}