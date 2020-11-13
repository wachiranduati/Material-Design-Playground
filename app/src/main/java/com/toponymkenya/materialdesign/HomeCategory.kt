package com.toponymkenya.materialdesign

import com.toponymkenya.materialdesign.adapters.MaterialItem


internal fun getMaterialCategories() : ArrayList<MaterialItem>{
    val typography = MaterialItem("Typography", R.drawable.typography, R.id.action_homeFragment_to_typographyFragment)
    val buttons = MaterialItem("Buttons", R.drawable.buttons, R.id.action_homeFragment_to_materialButtonsFragment)
    val palette = MaterialItem("Color Palette", R.drawable.color_palette, R.id.action_homeFragment_to_paletteFragment)
    val animations = MaterialItem("Animations", R.drawable.animations, R.id.action_homeFragment_to_animationsFragment)
    val input = MaterialItem("Input", R.drawable.input, R.id.action_homeFragment_to_inputFragment)
    val bottomnav = MaterialItem("Bottom Navigation", R.drawable.bottom_nav, R.id.action_homeFragment_to_typographyFragment)
    val grids = MaterialItem("Grids", R.drawable.grids, R.id.action_homeFragment_to_typographyFragment)
    val motion = MaterialItem("Motion", R.drawable.motions, R.id.action_homeFragment_to_typographyFragment)
    val dialogs = MaterialItem("Dialogs", R.drawable.dialogs, R.id.action_homeFragment_to_typographyFragment)
    return arrayListOf(typography, buttons, palette, animations, input, bottomnav, grids, motion, dialogs)

}
