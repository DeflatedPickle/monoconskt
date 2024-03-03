@file:Suppress("SpellCheckingInspection")

package com.deflatedpickle.monoconskt

import javax.imageio.ImageIO
import javax.swing.ImageIcon

// todo: https://specifications.freedesktop.org/icon-naming-spec/latest/
object Monocons {
    // cursors
    val POINTER = icon("arrow")

    // arrows
    val ARROW_DOWN = icon("arrow_down")
    val ARROW_DOWN_END = icon("arrow_down_end")
    val ARROW_UP = icon("arrow_up")
    val ARROW_UP_END = icon("arrow_up_end")
    val ARROW_BACK = icon("back_arrow")
    val ARROW_BACK_END = icon("back_arrow_end")
    val ARROW_FORWARD = icon("forward_arrow")
    val ARROW_FORWARD_END = icon("forward_arrow_end")

    // element
    val ELEMENT_ADD = icon("add_element")
    val ELEMENT_DELETE_ALL = icon("delete_all_elements")
    val ELEMENT_DELETE = icon("delete_element")
    val ELEMENT_EDIT = icon("edit_element")
    val ELEMENT_EDIT_CODE = icon("edit_elements_code")

    // files
    val GENERIC = icon("paper_blank")
    val TXT = icon("paper_text")
    val BIN = icon("paper_binary")
    val JSON = icon("paper_json")
    val CODE = icon("paper_code")
    val NBT = icon("nbt")

    // operations
    // -- general
    val SAVE = icon("save")
    val SAVE_AS = icon("save_as")
    val ERROR = icon("error")
    val EXIT = icon("exit")
    // -- files
    val FILE_NEW = icon("paper_new")
    val FILE_EXPORT = icon("paper_export")
    val FOLDER_NEW = icon("folder_new")
    val FOLDER_CLOSE = icon("folder_close")
    val FOLDER_OPEN = icon("folder_open")
    val FOLDER_OPEN_FILE = icon("folder_open_2")
    // -- find
    val BEGIN_END_SELECT = icon("begin_end_select")
    val CASE_INSENSITIVE = icon("case_insensitive")
    val REPLACE = icon("replace")
    // -- clipboard
    val CLIPBOARD = icon("clipboard")
    val CUT = icon("cut_2")
    val COPY = icon("copy")
    val PASTE = icon("paste")
    val DELETE = icon("delete")
    // -- navigation
    val FIND = icon("find")
    val FIND_NEXT = icon("find_next")
    val FIND_PREVIOUS = icon("find_previous")
    val GO_TO = icon("go_to")
    val SHOW = icon("show")
    val HIDE = icon("hide")
    val IGNORE = icon("ignore")
    val IGNORE_WHITESPACE = icon("ignore_whitespace")
    val STRIP_SPECIAL_CHARACTERS = icon("strip_special_characters")
    // -- media
    val PAUSE = icon("pause")
    val FAST_FORWARD = icon("fastforward")
    val REWIND = icon("rewind")
    val RELOAD = icon("reload_arrow")
    // -- history
    val UNDO = icon("undo")
    val REDO = icon("redo")
    // -- code
    val RUN = icon("run")
    val RUN_DEBUG = icon("run_in_debug")

    // tools
    // -- painting
    val PENCIL = icon("pencil")
    val ERASER = icon("eraser")
    val BRUSH = icon("brush")
    val COLOUR_PICKER = icon("colour_picker")
    val LINE = icon("line")
    val BUCKET = icon("paint_bucket")
    val DRAW_OVAL = icon("draw_oval")
    val DRAW_RECT = icon("draw_rect")
    val DRAW_TRIANGLE = icon("draw_triangle")
    // -- select
    val BOX_SELECT = icon("box_select")
    val TRANSPARENCY = icon("chessboard")
    val SELECT_ALL = icon("select_all")
    val SELECT_LINE = icon("select_line")
    val SELECT_WORD = icon("select_word")
    // -- zoom
    val ZOOM_IN = icon("zoom_in")
    val ZOOM_OUT = icon("zoom_out")
    // -- misc
    val MOVE = icon("move")
    val CROP = icon("crop")

    // misc
    val LINK = icon("chain_link")
    val VERTEX_SHADER = icon("vertex_shader")
    val FRAGMENT_SHADER = icon("fragment_shader")
    val HELP = icon("help_button")
    val LOCK_LOCKED = icon("lock_locked")
    val LOCK_UNLOCKED = icon("lock_unlocked")
    val SETTINGS = icon("settings")
    val SWAP = icon("swap")
    val TRANSLATE = icon("translate")
    val WRENCH = icon("wrench")

    private fun icon(name: String) = ImageIcon(
        ImageIO.read(
            this::class.java.getResource("/monocons/src/$name.png").openStream()
        )
    )
}