FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_remove_intel-corei7-64 = "file://hdmi-a-1-270.cfg"
SRC_URI_remove_intel-corei7-64 = "file://hdmi-a-1-90.cfg"
# Our HDMI plugged panel shows up as "DP-1"
SRC_URI_append_intel-corei7-64 = " file://dp-1-270.cfg"

#landscape for RPi3
SRC_URI_remove_raspberrypi3 = "file://hdmi-a-1-270-720p.cfg"
SRC_URI_append_raspberrypi3 = "file://hdmi-a-1-0-720p.cfg"

#landscape for RPi4
SRC_URI_remove_raspberrypi4 = "file://hdmi-a-1-270-720p.cfg"
SRC_URI_append_raspberrypi4 = "file://hdmi-a-1-0-1080p.cfg"

#landscape for Renesas
SRC_URI_remove_m3ulcb = "file://hdmi-a-1-270.cfg"
SRC_URI_append_m3ulcb = "file://hdmi-a-1-0-1080p.cfg"
