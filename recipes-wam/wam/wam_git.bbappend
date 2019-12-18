FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
    file://0001-agl-Hard-code-windowmanager-roles-for-certain-app-id.patch \
    file://0002-WIP-disable-tinyproxy-integration.patch \
"