FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_intel-corei7-64 = "file://revert-revert-use-gbm-with-in-process-gpu-mode.patch"
