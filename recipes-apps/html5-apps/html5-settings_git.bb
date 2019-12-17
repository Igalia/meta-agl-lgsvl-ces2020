# Copyright (c) 2018-2019 LG Electronics, Inc.

SUMMARY = "HTML5 mixer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

require html5-apps.inc

PR = "r0"

SRC_URI = "git://github.com/AGL-web-applications/settings.git;protocol=https;branch=master"
SRCREV = "aa94afd0725825010582766bc9ee6fe87a979108"

do_aglwgt_package() {
    cd ${B}
    ${NPM_BIN} run build
    cp ${B}/package/settings.wgt ${B}
}
