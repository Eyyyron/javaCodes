# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'Login.ui'
#
# Created by: PyQt5 UI code generator 5.15.9
#
# WARNING: Any manual changes made to this file will be lost when pyuic5 is
# run again.  Do not edit this file unless you know what you are doing.


from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(818, 472)
        self.Word = QtWidgets.QLabel(Dialog)
        self.Word.setGeometry(QtCore.QRect(20, 120, 381, 161))
        self.Word.setText("")
        self.Word.setPixmap(QtGui.QPixmap("../../res/login/WORD.png"))
        self.Word.setObjectName("Word")
        self.label_2 = QtWidgets.QLabel(Dialog)
        self.label_2.setGeometry(QtCore.QRect(-10, -10, 851, 521))
        self.label_2.setText("")
        self.label_2.setPixmap(QtGui.QPixmap("../../res/login/yellow.png"))
        self.label_2.setScaledContents(False)
        self.label_2.setObjectName("label_2")
        self.label_3 = QtWidgets.QLabel(Dialog)
        self.label_3.setGeometry(QtCore.QRect(70, 280, 261, 51))
        self.label_3.setText("")
        self.label_3.setPixmap(QtGui.QPixmap("../../res/login/test.png"))
        self.label_3.setObjectName("label_3")
        self.label_4 = QtWidgets.QLabel(Dialog)
        self.label_4.setGeometry(QtCore.QRect(410, 30, 371, 421))
        self.label_4.setText("")
        self.label_4.setPixmap(QtGui.QPixmap("../../res/login/white.png"))
        self.label_4.setScaledContents(True)
        self.label_4.setObjectName("label_4")
        self.label_5 = QtWidgets.QLabel(Dialog)
        self.label_5.setGeometry(QtCore.QRect(540, 80, 121, 41))
        self.label_5.setText("")
        self.label_5.setPixmap(QtGui.QPixmap("../../res/login/logIN.png"))
        self.label_5.setObjectName("label_5")
        self.label_6 = QtWidgets.QLabel(Dialog)
        self.label_6.setGeometry(QtCore.QRect(470, 160, 81, 20))
        self.label_6.setText("")
        self.label_6.setPixmap(QtGui.QPixmap(r"../../res/login/username.png"))
        self.label_6.setObjectName("label_6")
        self.label_7 = QtWidgets.QLabel(Dialog)
        self.label_7.setGeometry(QtCore.QRect(470, 240, 81, 20))
        self.label_7.setContextMenuPolicy(QtCore.Qt.NoContextMenu)
        self.label_7.setText("")
        self.label_7.setPixmap(QtGui.QPixmap("../../res/login/Password.png"))
        self.label_7.setObjectName("label_7")
        self.label_10 = QtWidgets.QLabel(Dialog)
        self.label_10.setGeometry(QtCore.QRect(490, 300, 111, 20))
        self.label_10.setText("")
        self.label_10.setPixmap(QtGui.QPixmap("../../res/login/show.png"))
        self.label_10.setObjectName("label_10")
        self.user = QtWidgets.QLineEdit(Dialog)
        self.user.setGeometry(QtCore.QRect(470, 190, 271, 31))
        self.user.setObjectName("user")
        self.passwor = QtWidgets.QLineEdit(Dialog)
        self.passwor.setGeometry(QtCore.QRect(470, 260, 271, 31))
        self.passwor.setObjectName("passwor")
        self.passwor.setEchoMode(QtWidgets.QLineEdit.Password)
        self.pushButton = QtWidgets.QPushButton(Dialog)
        self.pushButton.setGeometry(QtCore.QRect(480, 370, 251, 31))
        font = QtGui.QFont()
        font.setFamily("Microsoft YaHei UI Light")
        self.pushButton.setFont(font)
        self.pushButton.setObjectName("pushButton")
        self.checkBox = QtWidgets.QCheckBox(Dialog)
        self.checkBox.setGeometry(QtCore.QRect(470, 300, 70, 17))
        self.checkBox.setText("")
        self.checkBox.setObjectName("checkBox")
        self.checkBox.stateChanged.connect(self.toggleEchoMode)
        self.label_13 = QtWidgets.QLabel(Dialog)
        self.label_13.setGeometry(QtCore.QRect(490, 330, 221, 31))
        self.label_13.setText("")
        self.label_13.setPixmap(QtGui.QPixmap("../../res/login/Btn_Forgot Password.png"))
        self.label_13.setVisible(False)
        self.label_13.setObjectName("label_13")
        self.label_2.raise_()
        self.Word.raise_()
        self.label_3.raise_()
        self.label_4.raise_()
        self.label_5.raise_()
        self.label_6.raise_()
        self.label_7.raise_()
        self.label_10.raise_()
        self.user.raise_()
        self.passwor.raise_()
        self.pushButton.raise_()
        self.checkBox.raise_()
        self.label_13.raise_()

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Dialog"))
        self.pushButton.setText(_translate("Dialog", "LOGIN"))

    def toggleEchoMode(self, state):
        if state == QtCore.Qt.Checked:
            self.passwor.setEchoMode(QtWidgets.QLineEdit.Normal)
        else:
            self.passwor.setEchoMode(QtWidgets.QLineEdit.Password)

if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())